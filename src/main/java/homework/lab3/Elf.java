package homework.lab3;

public class Elf extends Hero{
    Elf(String name) {
        super(name, "Elf",10, 10);
    }
    public int kick(Hero c) {
        int hpInitial = c.hp;
        if (this.power > c.power) {
            c.hp = 0;
            c.isAlive = false;
        } else {
            c.power -= 1;
        }
        return (hpInitial - c.hp);
    }
}
