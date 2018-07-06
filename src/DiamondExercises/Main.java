package DiamondExercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        Diamond diamond = new Diamond();
        DiamondWithName diamondWithName = new DiamondWithName();

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        reader.close();

        System.out.println("Isosceles Triangle:\n" + isoscelesTriangle.IsoscelesTriangle(n));
        System.out.println("Diamond:\n" + diamond.Diamond(n));
        System.out.println("Diamond With Name:\n" + diamondWithName.DiamondWithName(n));
    }

}