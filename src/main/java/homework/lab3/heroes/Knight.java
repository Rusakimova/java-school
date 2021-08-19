package homework.lab3.heroes;

import homework.lab3.utils.RandomUtil;
import homework.lab3.weapons.Sword;
import homework.lab3.weapons.Weapon;

public class Knight extends AbstractHero {
    private Weapon weapon = new Sword();
    public int kick(Hero enemy) {
        return weapon.kick(this, enemy);
    }
    public Knight() {
        setHp(RandomUtil.between(2, 12));
        setPower(RandomUtil.between(2, 12));
    }
}
