package homework.lab2;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder()
                .debt(50)
                .bonus(100)
                .name("Vladimir")
                .salary(1000)
                .build();
        System.out.println(client.getBonus());
    }
}
