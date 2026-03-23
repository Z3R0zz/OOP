import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int total = 0;
            int points = 0;

            boolean learned = false;

            while (!learned) {
                int num1 = (int) (Math.random() * 10) + 1;
                int num2 = (int) (Math.random() * 10) + 1;

                System.out.println("What is " + num1 + " * " + num2 + "?");
                int answer = Integer.parseInt(scanner.nextLine());

                total += 1;

                if (answer != num1 * num2) {
                    System.out.println("Wrong! The correct answer is " + (num1 * num2) + ". Your current score is " + points + "/10");
                    if (total == 10) {
                        System.out.println("You got " + points + " correct answers out of 10. Try again!");
                        break;
                    }
                    continue;
                }

                points += 1;
                System.out.println("Correct! Your current score is " + points + "/10");

                if (points == 10) {
                    System.out.println("Congratulations on learning multiplication! You got " + total + " correct answers in total.");
                    learned = true;
                    break;
                }
            }

            if (learned) {
                scanner.close();
                break;
            }
        }
    }
}
