package homework.lab3;

public class Swordsman extends Hero{
    Swordsman(String name, String type, int power, int hp) {
        super(name, type, power, hp);
    }
    protected int kick(Hero c) {
        int damage = (int) (Math.random() * power) ;
        c.hp -= damage;
        if (c.hp <= 0) {
            c.isAlive = false;
        }
        return damage;
    }
}
