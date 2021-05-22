package timeComplexity.linearTime;

public class Demo7 {
    public static void main(String[] args) {
        // single static statement
        int[] num = {1, 2, 3, 4, 5};
        fun(num);

        int[] numOther = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        fun(numOther);
    }

    // O(n) overall for billions records
    private static void fun(int num[]) {
        // O(100000 * n)
        for (int i = 0; i < 100000 * num.length; i++) {
            System.out.println("Square: " + num[i / 100000] * num[i / 100000]);
        }
    }
}
