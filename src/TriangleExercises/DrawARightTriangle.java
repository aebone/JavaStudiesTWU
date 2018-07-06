package TriangleExercises;

public class DrawARightTriangle {

    public String DrawARightTriangle(int n) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result.append("*");
            }
            result.append("\n");
        }

        return result.toString();
    }
}
