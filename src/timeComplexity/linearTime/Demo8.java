package timeComplexity.linearTime;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;

public class Demo8 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        addItemsToList(integers, 500000);

        Instant startTime = Instant.now();
        iterateList(integers);
        Instant endTime = Instant.now();

        System.out.println("Execution time : " + Duration.between(startTime, endTime));
    }

    private static void addItemsToList(List<Integer> integers, int noOfElements) {
        for (int i = 0; i < noOfElements; i++) {
            integers.add(i);
        }
    }

    private static void iterateList(List<Integer> integers) {
        for (Integer n: integers) {
            System.out.println(n);
        }
    }
}
