import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start:");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter end:");
        int end = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if (start > end) {
            System.out.print("Start should be smaller than end");
            return;
        }

        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
