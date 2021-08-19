package homework.lab5;

import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        DateUtils dateUtils = new DateUtils();
        String dateString = dateUtils.convertDateToString(date);
        Date dateDate = dateUtils.convertStringToDate("21%авг.%2021,14:30");
        System.out.println(dateString);
        System.out.println(dateDate);
    }

}
