package classwork.my_spring;


import lombok.SneakyThrows;

public class InjectByTypeAnnotationConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        var type = t.getClass();
        var fields = type.getDeclaredFields();
        for (var field:fields) {
            if(field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                field.set(t, ObjectFactory.getInstance().createObject(field.getType()));
            }
        }
    }
}
