package DiamondExercises;

public class Diamond {

    public String Diamond (int n) {

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                result.append(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                result.append("*");
            }

            result.append("\n");
        }


        for (int i = n - 1; i > 0; i--) {

            for (int j = 1; j <= n - i; j++) {
                result.append(" ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++) {
                result.append("*");
            }

            result.append("\n");
        }

        return result.toString();

    }
}
