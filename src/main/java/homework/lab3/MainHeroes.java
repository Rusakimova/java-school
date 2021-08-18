package homework.lab3;

import java.util.*;

public class MainHeroes {
    public static void main(String[] args) {

        HeroFactory heroFactory = new HeroFactory();
        Hero hero1 =heroFactory.createHero();
        Hero hero2 =heroFactory.createHero();

        GameManager gameManager = new GameManager();
        gameManager.fight(hero1, hero2);

    }
}
