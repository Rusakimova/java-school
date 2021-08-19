package homework.lab3.heroes;

import homework.lab3.infra.HeroFactory;
import homework.lab3.infra.ReflectionHeroFactory;

public class MainHeroes {
    public static void main(String[] args) {

        ReflectionHeroFactory heroFactory = new ReflectionHeroFactory();
        Hero hero1 = heroFactory.createHero();
        Hero hero2 = heroFactory.createHero();

        GameManager gameManager = new GameManager();
        gameManager.fight(hero1, hero2);

    }
}
