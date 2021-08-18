package homework.lab2;

public class Client {
    private final int debt;
    private final int bonus;
    private final String name;
    private final int salary;

    private Client(Builder builder) {
        debt = builder.debt;
        bonus = builder.bonus;
        name = builder.name;
        salary = builder.salary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer debt;
        private Integer bonus;
        private String name;
        private Integer salary;
        private boolean WasUsed;

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
            if (WasUsed) {
                throw new IllegalStateException("builder was already used");
            }
            WasUsed = true;
            return new Client(this);
        }
    }

    public int getBonus() {
        return bonus;
    }
}
