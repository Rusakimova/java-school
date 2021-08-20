package homework.lab5;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateUtils dateUtils = new DateUtils();
        String dateString = dateUtils.convertDateToString(date);
        LocalDateTime dateDate = dateUtils.convertStringToDate("20%01%2021,09:43");
        System.out.println(dateDate);
        System.out.println(dateString);
    }

}
