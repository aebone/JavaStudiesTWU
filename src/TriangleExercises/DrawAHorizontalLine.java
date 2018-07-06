package TriangleExercises;

import java.util.Scanner;

public class DrawAHorizontalLine {

    public String DrawAHorizontalLine(int n) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++)
            result.append("*");

        return result.toString() + "\n";

    }
}
