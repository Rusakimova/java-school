package homework.lab3.heroes;

import homework.lab3.utils.RandomUtil;
import homework.lab3.weapons.Sword;
import homework.lab3.weapons.Weapon;

public class King extends AbstractHero {
    private Weapon weapon = new Sword();

    public int kick(Hero enemy) {
        return weapon.kick(this, enemy);
    }
    public King() {
        setHp(RandomUtil.between(5, 15));
        setPower(RandomUtil.between(5, 15));
    }
}
