import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary number:");
        String binary = scanner.nextLine();
        scanner.close();

        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, length - 1 - i);
            }
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}
