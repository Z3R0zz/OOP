import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input leg a of the triangle:");
        double a = Integer.parseInt(scanner.nextLine());

        System.out.println("Input leg b of the triangle:");
        double b = Integer.parseInt(scanner.nextLine());

        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("The hypotenuse of the triangle is %.1f \n", hypotenuse);

        scanner.close();
    }
}
