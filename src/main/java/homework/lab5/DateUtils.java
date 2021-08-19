package homework.lab5;

import java.text.*;
import java.util.Date;

public class DateUtils {
    private String pattern = "dd%MMM%yyy,hh:mm";
    SimpleDateFormat formatForDate = new SimpleDateFormat(pattern);

    Date convertStringToDate(String date) throws ParseException {
        return formatForDate.parse(date);
    }
    String convertDateToString(Date date) {
        return (formatForDate.format(date));
    }
}
