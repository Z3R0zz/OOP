public class Main {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i <= n; i++) {
            System.out.print(" ");

            if (i != n) {
                System.out.print(" ");
            }

            for (int s = 0; s < n - 1 - i; s++) {
                System.out.print(" ");
            }

            for (int s = 0; s < 2 * i + 1; s++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}