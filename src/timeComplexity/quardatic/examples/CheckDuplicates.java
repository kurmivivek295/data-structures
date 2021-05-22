package timeComplexity.quardatic.examples;

public class CheckDuplicates {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3 ,4, 5};
        System.out.println(hadDuplicate(numArr));

        int[] numArr1 = {1, 2, 3, 2, 4, 5};
        System.out.println(hadDuplicate(numArr1));
    }

    public static boolean hadDuplicate(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (numArr[i] == numArr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
