package classwork.aug24;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum Seniority {
    JUN(0, 10),MIDDLE(11, 20),SENIOR(21, Integer.MAX_VALUE);
    private final int minSalary, maxSalary;
    public static Seniority getBySalary(int salary) {
        var optionalSeniority = Arrays.stream(values())
                .filter(s -> s.getMaxSalary() >= salary && s.getMinSalary() <= salary)
                .findFirst();
        return optionalSeniority.get();
    }
}
