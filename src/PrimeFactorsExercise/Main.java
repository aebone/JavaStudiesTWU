package PrimeFactorsExercise;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int number = 1;
        Set primefactors = new HashSet<>();
        long copyOfInput = number;

        for (int i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                primefactors.add(i); // prime factor
                copyOfInput /= i;
                i--;
            }
        }
        System.out.println(primefactors);

    }
}
