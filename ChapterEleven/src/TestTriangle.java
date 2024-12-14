import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the sides of the triangle
        System.out.print("Enter side1 of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 of the triangle: ");
        double side3 = input.nextDouble();

        // Prompt user for the color
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        // Prompt user for the filled property
        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = input.nextBoolean();

        // Create Triangle object
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display triangle details
        System.out.println("\nTriangle Details:");
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
