package classwork.task1;

import java.util.List;
import java.util.function.Consumer;

public class ListUtils {
    public static <T> int countDuplicates(T object, List<T> objects, Equalator<T> equalator) {
        int calc = 0;
        for (T t :objects) {
            if (equalator.equals(t, object)) {
                calc++;
            }
        }
        return calc;
    }
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer) {
        for (T element : list) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            consumer.accept(element);
        }
    }
}
