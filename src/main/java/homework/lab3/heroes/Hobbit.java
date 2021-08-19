package homework.lab3.heroes;

public class Hobbit extends AbstractHero {
    public Hobbit() {
        setHp(3);
        setPower(0);
    }

    public int kick(Hero enemy) {
        ToCry();
        return 0;
    }
    public void ToCry() {
        System.out.println("I'm crying, don't touch me!");
    }


}
