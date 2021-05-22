package timeComplexity.linearTime;

public class Demo2 {
    public static void main(String[] args) {
        // single static statement
        int[] num = {1, 2, 3, 4, 5};
        fun(num);

        int[] numOther = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        fun(numOther);
    }

    // O(n) overall
    private static void fun(int num[]) {
        // O(1)
        if (num.length%2 == 0) {
            System.out.println(num.length);
        } else {
            for (int i = 0; i < num.length; i++) {
                // O(n)
                System.out.println(num.length);
            }
        }
    }
}
