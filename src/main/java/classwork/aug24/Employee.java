package classwork.aug24;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Employee {
    private String name;
    private int salary;
}
