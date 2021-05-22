package timeComplexity.linearTime;

public class Demo4 {
    public static void main(String[] args) {
        // single static statement
        int[] num = {1, 2, 3, 4, 5};
        fun(num);

        int[] numOther = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        fun(numOther);
    }

    // O(n) overall
    private static void fun(int num[]) {
        // O(n)
        for (int i = 0; i < num.length; i++) {
            System.out.println("Square: " + num[i] * num[i]);
        }
        // O(n)
        for (int i = 0; i < num.length; i++) {
            System.out.println("Square: " + num[i] * num[i] * num[i]);
        }
    }
}
