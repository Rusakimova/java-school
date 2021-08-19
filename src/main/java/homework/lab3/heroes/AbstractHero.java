package homework.lab3.heroes;

import homework.lab3.heroes.Hero;
import homework.lab3.utils.RandomUtil;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public abstract class AbstractHero implements Hero {
    private final String name;
    private int power;
    private int hp;

    public AbstractHero() {
        this.name = RandomUtil.randomName();
    }

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public void decreasePower(int delta) {
        this.power -= delta;
    }

    @Override
    public void decreaseHp(int delta) {
        this.hp -= delta;
    }

    @Override
    public void die() {
        hp = 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }
}
