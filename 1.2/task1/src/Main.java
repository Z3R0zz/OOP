import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give temperature in Fahrenheit");
        float temp = Integer.parseInt(scanner.nextLine());

        float Celsius = (temp - 32) * 5/9;
        System.out.printf("Temperature in Celsius %.1f", Celsius);

        scanner.close();
    }
}
