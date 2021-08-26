package classwork.my_spring;

public class BenchmarkCleanerImplWrapper implements Cleaner{

    @InjectByType
    private CleanerImpl cleaner;
    @Override
    public void clean() {
        long startTime = System.nanoTime();
        cleaner.clean();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

    }
}
