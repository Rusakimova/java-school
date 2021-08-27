package classwork.my_spring;

import lombok.Getter;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObjectFactory {
    @Getter
    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaConfig();
    private Reflections scanner = new Reflections("classwork.my_spring");
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators = new ArrayList<>();
    
    @SneakyThrows
    private ObjectFactory() {
        Set <Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass:classes){
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                configurators.add(aClass.getDeclaredConstructor().newInstance());
            }
        }
        Set <Class<? extends ProxyConfigurator>> proxyClasses = scanner.getSubTypesOf(ProxyConfigurator.class);
        for (Class<? extends ProxyConfigurator> aClass:proxyClasses){
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                proxyConfigurators.add(aClass.getDeclaredConstructor().newInstance());
            }
        }

    }



    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImple(type);
        T t = type.getDeclaredConstructor().newInstance();
        configure(t);
        initialize(t);
        t = wrapWithProxyIfNeeded(type, t);
        return t;
    }
    @SneakyThrows
    private <T> T wrapWithProxyIfNeeded(Class<T> type, T t) {
        for (ProxyConfigurator conf: proxyConfigurators){
            t = (T) conf.configure(t, type);
        }
        return t;
    }

    @SneakyThrows
    private <T> void initialize(T t){
        for (Method method: t.getClass().getMethods()){
            if (method.getName().startsWith("init")){
                method.invoke(t);
            }
        }
    }

    private <T> void configure(T t) {
        configurators.forEach(configurator -> configurator.configure(t));
    }

    private <T> Class<T> resolveImple(Class<T> type) {
        if (type.isInterface()) {
            Class<T> implClass = config.getImplClass(type);
            if (implClass == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new IllegalStateException(type + " has 0 or more than one impl was found, please update your config");
                }
                implClass = (Class<T>) classes.iterator().next();
            }
            type = implClass;
        }
        return type;
    }

}
