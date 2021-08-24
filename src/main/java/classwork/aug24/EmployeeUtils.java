package classwork.aug24;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeUtils {
    public static int totalSalary(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getSalary).sum();
    }
    public static List<String> sortSalary(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .collect(Collectors.toList());

    }
    public static Map<String, Employee> listToMap(List<Employee> employees) {
         return employees.stream()
                .collect(Collectors.toMap(Employee::getName, Function.identity(), (e1, e2)->(e1.getSalary()>e2.getSalary()? e1:e2)));
    }
}
