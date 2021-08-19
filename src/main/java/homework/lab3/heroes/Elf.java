package homework.lab3.heroes;

public class Elf extends AbstractHero{

    public Elf() {
        setHp(10);
        setPower(10);
    }
    public int kick(Hero enemy) {
        if (this.getPower() > enemy.getPower()) {
            int damage = enemy.getHp();
            enemy.die();
            return damage;
        } else {
            enemy.decreasePower(1);
            return 0;
        }
    }
}
