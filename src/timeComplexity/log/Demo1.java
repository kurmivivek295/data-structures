package timeComplexity.log;

public class Demo1 {
    public static void main(String[] args) {
        loop(10);
        System.out.println();
        loop(50);
    }

    public static void loop(Integer n) {
        int iteration = 0;
        for (int i = 1; i <= n;) {
            System.out.println("Iteration " + iteration + " i " + i);
            i = i * 2;
            iteration++;
        }
    }
}
