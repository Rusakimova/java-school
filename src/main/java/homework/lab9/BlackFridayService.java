package homework.lab9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlackFridayService {

    public void printBlackFridayPerYearSorted(int startYear, int endYear) {
        LocalDate startDate = LocalDate.of(startYear, 1,13);
        LocalDate endDate = LocalDate.of(endYear, 1,13);
        Stream
                .iterate(startDate, date ->date.plusMonths(1))
                .limit(ChronoUnit.MONTHS.between(startDate, endDate))
                .filter(date->date.getDayOfWeek().getValue()==3)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Long>::getValue)
                        .thenComparing(Map.Entry::getKey)
                        .reversed()
                )
                .forEach(System.out::println);
    }

}
