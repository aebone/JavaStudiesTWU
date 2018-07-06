package DiamondExercises;

public class IsoscelesTriangle {


    public String IsoscelesTriangle(int n) {

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

        // espaco primeira linha: n - 1
        // asteriscos ultima linha: (altura * 2) - 1

        return result.toString();
    }
}
