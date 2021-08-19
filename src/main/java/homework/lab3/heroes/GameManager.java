package homework.lab3.heroes;

public class GameManager {
    void fight(Hero c1, Hero c2) {
        System.out.println("There is a battle between "+ c1.toString() + " and " + c2.toString());
        System.out.println(c1.toString() + " has hp = " + c1.getHp() + " power = " + c1.getPower());
        System.out.println(c2.toString() + " has hp = " + c2.getHp() + " power = " + c2.getPower());
        while (c1.isAlive()  &&  c2.isAlive()) {
            int damage = c1.kick(c2);
            System.out.println(c1.toString() + " kicked " + c2.toString() + " for " + damage + " hp.");
            damage = c2.kick(c1);
            System.out.println(c2.toString() + " kicked " + c1.toString() + " for " + damage + " hp.");
        }
        if (c1.isAlive()) {
            System.out.println(c1.toString() + " has won the battle");
        } else {
            System.out.println(c2.toString() + " has won the battle");
        }
    }
}
