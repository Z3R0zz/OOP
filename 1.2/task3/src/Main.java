import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight (g):");
        int grams = Integer.parseInt(scanner.nextLine());

        double totalLuoti = grams / 13.28;

        int leiviska = (int) (totalLuoti / (20 * 32));
        double remainingLuoti = totalLuoti % (20 * 32);

        int naula = (int) (remainingLuoti / 32);
        double luoti = remainingLuoti % 32;

        System.out.printf("%d grams is %d leiviskä, %d naula, and %.2f luoti. \n",
                grams, leiviska, naula, luoti);

        scanner.close();
    }
}
