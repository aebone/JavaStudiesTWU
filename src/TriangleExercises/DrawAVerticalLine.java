package TriangleExercises;

import java.util.Scanner;

public class DrawAVerticalLine {

    public String DrawAVerticalLine(int n) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++)
            result.append("*\n");

        return result.toString();

    }

}
