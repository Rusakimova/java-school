package homework.lab3.utils;
import java.util.List;
import java.util.Random;
import com.github.javafaker.Faker;

public class RandomUtil {
    private static Random random = new Random();
    private static Faker faker = new Faker();

    public static int between(int min, int max) {
        return (min + random.nextInt(max - min+1));
    }

    public static String randomName() {
        return faker.gameOfThrones().character();
    }

    public static <T> T getRandomElement(List<T> list) {
        int i = RandomUtil.between(0, list.size()-1);
        return list.get(i);
    }
}
