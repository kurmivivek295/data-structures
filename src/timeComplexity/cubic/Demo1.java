package timeComplexity.cubic;

public class Demo1 {
    public static void main(String[] args) {
        loop(4);
    }

    public static void loop(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("i " + i);
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print("j " + j);
                System.out.println();
                for (int k = 0; k < n; k++) {
                    System.out.print("k " + k);
                }
                System.out.println();
            }
        }
    }
}
