package timeComplexity.linearTime;

public class Demo1 {
    public static void main(String[] args) {
        // single static statement
        int[] num = {1, 2, 3, 4, 5};
        fun(num);

        int[] numOther = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        fun(numOther);
    }

    private static void fun(int num[]) {
        //loop will execute based on the length of num array
        //so the function execution depends on the num array length
        // and the loop executes linearly
        for (int i = 0; i < num.length; i++) {
            //static statement
            System.out.println(num.length);
        }
    }
}
