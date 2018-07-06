package TriangleExercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        reader.close();

        EasiestExerciseEver easiestExerciseEver = new EasiestExerciseEver();
        DrawAHorizontalLine drawAHorizontalLine = new DrawAHorizontalLine();
        DrawAVerticalLine drawAVerticalLine = new DrawAVerticalLine();
        DrawARightTriangle drawARightTriangle = new DrawARightTriangle();

        System.out.println("Easiest Exercise Ever:\n" + easiestExerciseEver.printAsterisks());
        System.out.println("Draw A Horizontal Line\n" + drawAHorizontalLine.DrawAHorizontalLine(n));
        System.out.println("Draw A Vertical Line\n" + drawAVerticalLine.DrawAVerticalLine(n));
        System.out.println("Draw A Triangle Line\n" + drawARightTriangle.DrawARightTriangle(n));
    }

}
