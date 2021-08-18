package homework.lab3;

public class GameManager {
    void fight(Hero c1, Hero c2) {
        System.out.println("There is a battle between "+ c1.type + " " + c1.name + " and " + c2.type + " " + c2.name);
        System.out.println(c1.type + " " + c1.name + " has " + c1.power + " power and " + c1.hp + " hp");
        System.out.println(c2.type + " " + c2.name + " has " + c2.power + " power and " + c2.hp + " hp");
        while (c1.isAlive  &&  c2.isAlive) {
            int damage = c1.kick(c2);
            System.out.println(c1.type + " " + c1.name + " kicked " + c2.type + " " + c2.name + " for " + damage + " hp.");
            damage = c2.kick(c1);
            System.out.println(c2.type + " " + c2.name + " kicked " + c1.type + " " + c1.name + " for " + damage + " hp.");
        }
        if (c1.isAlive) {
            System.out.println(c1.type + " " + c1.name + " has won the battle");
        } else {
            System.out.println(c2.type + " " + c2.name + " has won the battle");
        }
    }
}
