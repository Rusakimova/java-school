package homework.lab3.heroes;

public interface Hero {
    int getHp();
    int getPower();
    void setPower(int power);
    void setHp(int hp);
    int kick(Hero enemy);
    void decreasePower(int delta);
    void decreaseHp(int delta);
    void die();
    boolean isAlive ();
}
