package timeComplexity.constantTime;

public class Demo4 {
    public static void main(String[] args) {
        // single static statement
        fun();
    }

    private static void fun() {
        //loop will execute for the same amount of time always
        for (int i = 0; i < 5; i++) {
            //static statement
            System.out.println("fun()");
        }
    }
}
