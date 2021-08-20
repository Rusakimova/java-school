package homework.lab5;

import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    private static final String pattern = "dd%MM%yyyy,HH:mm";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

    public static LocalDateTime convertStringToDate(String date) {
        return LocalDateTime.from(formatter.parse(date));
    }
    public static String convertDateToString(LocalDateTime date) {
        return date.format(formatter);
    }
}
