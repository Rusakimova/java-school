package homework.lab3;

public class Hobbit extends Hero{
    Hobbit(String name) {
        super(name, "Hobbit", 0, 3);
    }

    public int kick(Hero c) {
        ToCry();
        if (this.hp <= 0) {
            this.isAlive = false;
        }
        return 0;
    }
    public void ToCry() {
        System.out.println("I'm crying, don't touch me!");
    }


}
