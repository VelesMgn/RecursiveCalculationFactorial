import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        final int num = 10;

        long result = new ForkJoinPool().invoke(new FactorialTask(num));

        System.out.println("Факториал " + num + " = " + result);
    }
}