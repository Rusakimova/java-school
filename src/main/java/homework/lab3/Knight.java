package homework.lab3;

public class Knight extends Swordsman{
    Knight(String name) {
        super(name, "Knight", 2 + (int) (Math.random() * 11 ), 5 + (int) (Math.random() * 11));
    }
}
