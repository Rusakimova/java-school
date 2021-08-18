package homework.lab3;

public abstract class Hero {
    protected String name;
    protected int power;
    protected int hp;
    protected String type;
    abstract int kick(Hero c);
    protected boolean isAlive = true;
    Hero(String name, String type, int power, int hp) {
        this.name = name;
        this.power = power;
        this.hp = hp;
        this.type = type;
    }
}
