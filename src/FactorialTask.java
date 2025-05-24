import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<Long> {
    private final long num;

    public FactorialTask(long num) {
        this.num = num;
    }

    @Override
    protected Long compute() {
        if (num <= 1) return num;

        FactorialTask subtask  = new FactorialTask(num - 1);
        subtask.fork();

        return num * subtask.join();
    }
}