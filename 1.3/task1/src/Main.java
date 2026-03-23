import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        float a = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter b:");
        float b = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter c:");
        float c = Float.parseFloat(scanner.nextLine());

        scanner.close();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            System.out.print("No real roots\n");
            return;
        }

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.printf("Two roots: x1 = %.1f, x2 = %.1f\n", root1, root2);
            return;
        }

        double root = -b / (2 * a);
        System.out.printf("One root: x = %.1f\n", root);
    }
}
