import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<Integer> {
    private final int num;

    public FactorialTask(int num) {
        this.num = num;
    }

    @Override
    protected Integer compute() {
        if (num <= 1) return num;

        FactorialTask subtask  = new FactorialTask(num - 1);
        subtask.fork();

        return num * subtask.join();
    }
}
