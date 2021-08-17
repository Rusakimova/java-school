package homework.lab2;

public class Client {
    private final int debt; //todo you can't remove final
    private final int bonus;
    private final String name;
    private final int salary;

    public Client(Builder builder) {
        debt = builder.debt;
        bonus = builder.bonus;
        name = builder.name;
        salary = builder.salary;
    }
    public static class Builder {
        private int debt; //todo you can't remove final
        private int bonus;
        private String name;
        private int salary;

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }

    public int getBonus() {
        return bonus;
    }
}
