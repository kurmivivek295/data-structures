package timeComplexity.constantTime;

public class Demo5 {
    public static void main(String[] args) {
        // single static statement
        int[] num = {1, 2, 3, 4, 5};
        fun(num);
    }

    private static void fun(int num[]) {
        //loop will execute for the same amount of time always
        for (int i = 0; i < 5; i++) {
            //static statement
            System.out.println(num.length);
        }
    }
}
