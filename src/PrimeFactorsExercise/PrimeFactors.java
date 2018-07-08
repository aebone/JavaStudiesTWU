package PrimeFactorsExercise;

import java.util.ArrayList;

public class PrimeFactors {

    public ArrayList<Integer> PrimeFactors(int n) {

        ArrayList<Integer> numbers = new ArrayList<>();

        int copy = n;

        for (int i = 2; i <= copy; i++) {
            if (copy % i == 0) {
                numbers.add(i);
                copy = copy / i;
                i--;
            }
        }

        return numbers;

    }
}
