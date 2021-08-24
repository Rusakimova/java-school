package classwork.aug24;

import java.util.List;
import java.util.Map;

import static classwork.aug24.EmployeeUtils.groupBySeniority;

public class Main {

    public static void main(String[] args) {
        String path = "data/song.txt";
        long calc = fileUtils.calcAmount(path);
        //System.out.println(calc);
        List<Employee> employees = List.of(new Employee("Vasya", 5), new Employee("Elena", 90), new Employee("Katya", 150));
        List<String> names = EmployeeUtils.sortSalary(employees);
        Map<String, Employee> newMap = EmployeeUtils.listToMap(employees);
        //System.out.println(names);
        //System.out.println(newMap);
        System.out.println(groupBySeniority(employees));
    }


}
