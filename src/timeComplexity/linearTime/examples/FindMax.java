package timeComplexity.linearTime.examples;

public class FindMax {
    public static void main(String[] args) {
        Integer[] numArr = {5, 3, 6, 2, 7};
        System.out.println(findMax(numArr));

        Integer[] numArr1 = {5, 8, 6, 2, 7, 1, 4, 9};
        System.out.println(findMax(numArr1));
    }

    public static Integer findMax(Integer[] numArr) {
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < numArr.length; i++) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
        }
        return max;
    }
}
