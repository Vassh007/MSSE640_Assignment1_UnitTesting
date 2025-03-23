import java.util.Scanner;

/**
 * The TriangleIdentify class provides a method to determine the type of a triangle
 * based on the lengths of its three sides. It checks for the validity of the triangle
 * and classifies it as Equilateral, Isosceles, or Scalene.
 */
public class TriangleIdentify {
    public static String identifyTriangle(int a, int b, int c) {
        if ((a <= 0) || (b <= 0) || (c <= 0))
            return "Invalid";

        // Check if the given sides can form a valid triangle
        if ((a + b <= c || a + c <= b || b + c <= a))
            return "Invalid";

        // Determine triangle type
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c)
            return "Isosceles";
        else
            return "Scalene";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter side 1: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                return;
            }
            int side1 = sc.nextInt();

            System.out.print("Enter side 2: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                return;
            }
            int side2 = sc.nextInt();

            System.out.print("Enter side 3: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                return;
            }
            int side3 = sc.nextInt();

            String result = identifyTriangle(side1, side2, side3);
            System.out.println("The triangle is: " + result);
        } finally {
            sc.close(); // Close the Scanner in a finally block to ensure it gets closed
        }
    }
}