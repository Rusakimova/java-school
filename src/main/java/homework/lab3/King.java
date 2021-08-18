package homework.lab3;

public class King extends Swordsman{
    King(String name) {
        super(name, "King", 5 + (int) (Math.random() * 11 ), 5 + (int) (Math.random() * 11));
    }
}
