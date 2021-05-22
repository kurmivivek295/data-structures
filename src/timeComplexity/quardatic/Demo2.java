package timeComplexity.quardatic;

public class Demo2 {
    public static void main(String[] args) {
        loop(2);
        System.out.println();
        loop(4);
    }

    public static void loop(Integer n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j);
            }
        }
    }
}
