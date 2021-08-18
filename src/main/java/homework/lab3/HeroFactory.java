package homework.lab3;

import com.github.javafaker.Faker;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class HeroFactory {
    private final List<Function<String, Hero>> heroTypes = new ArrayList<>();
    private final Random random = new Random();
    private final Faker faker = new Faker();

    public HeroFactory() {
        heroTypes.add(Elf::new);
        heroTypes.add(Hobbit::new);
        heroTypes.add(King::new);
        heroTypes.add(Knight::new);
    }
    public Hero createHero() {
        int randomHero= random.nextInt(heroTypes.size());
        return heroTypes.get(randomHero).apply(faker.gameOfThrones().character());
    }
}