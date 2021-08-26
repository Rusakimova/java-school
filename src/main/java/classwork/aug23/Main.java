package classwork.aug23;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = List.of("java", "JAVA", "jAvA");
        int calc = ListUtils.countDuplicates("java", list, (t1, t2)->t1.equalsIgnoreCase(t2));
        System.out.println(calc);
    }
}
