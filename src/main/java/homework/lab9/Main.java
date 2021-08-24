package homework.lab9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int startYear = 1999;
        int endYear = 2021;
        BlackFridayService interval = new BlackFridayService();
        interval.printBlackFridayPerYearSorted(startYear,endYear);
    }
}
