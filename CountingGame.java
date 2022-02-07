import java.util.Scanner;

    public class CountingGame {

        public static void main(String[] args) {
            // write your code here
            Scanner scanner = new Scanner(System.in);
            int number = 1 + (int) (20 * Math.random());


            int m = 10;
            int n, guess;
            System.out.println("Hello! What is your name?");


            System.out.println("Well," + "name" + "I am thinking of a number between 1 and 20.");
            System.out.println("Take a guess.");
            for (n = 0; n < m; n++) {
                System.out.println("guess the number");
                guess = scanner.nextInt();
                if (number == guess) {
                    System.out.println("Congratulations!" + "You guess the number.");

                    break;
                }
                else if (number > guess && n != m -1) {
                    System.out.println ("The number is" + "greater than" + guess);
                }
                else if (number < guess && n != m -1) {
                    System.out.println("The number is" + " less than " + guess);
                }
            }
        }
    }
