package classwork.aug24;

import lombok.SneakyThrows;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class fileUtils {
    @SneakyThrows
    public static long calcAmount(String path){
        Stream<String> linesStream = Files.lines(Path.of(path));
        return linesStream.flatMap(lines-> Arrays.stream(lines.split("\\W+"))).count();
    }


}
