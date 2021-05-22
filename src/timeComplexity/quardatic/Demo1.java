package timeComplexity.quardatic;

public class Demo1 {
    public static void main(String[] args) {
        loop(2);
        System.out.println();
        loop(4);
    }

    public static void loop(Integer n) {
        for (int i = 1; i <= n * n; i++) {
            System.out.print(i);
        }
    }
}
