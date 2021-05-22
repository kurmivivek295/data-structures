package timeComplexity.linearTime.examples;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.Duration;
import java.time.Instant;

public class PrimeNumCheck {
    public static void main(String[] args) {
        Instant startTime = Instant.now();
        System.out.println(checkPrime(2112121));
        Instant endTime = Instant.now();
        System.out.println(Duration.between(startTime, endTime).getNano());
    }

    public static boolean checkPrime(Integer num) {
        boolean isPrime = Boolean.TRUE;
        // O(n)
//      for (int i = 2; i < num; i++) {

        // O(n/2)
//      for (int i = 2; i < num/2; i++) {

        // O(sqrt(n))
        for (int i = 2; i < Math.sqrt(num); i++) {
            if ( num%i == 0) {
                isPrime = Boolean.FALSE;
            }
        }

        return isPrime;
    }
}
