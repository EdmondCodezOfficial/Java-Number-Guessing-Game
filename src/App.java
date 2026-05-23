import java.util.Random;
import java.util.Scanner;

public class App {
    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int numMin = 0;
        int numMax = 0;

        System.out.println("Choose a range for MY guessing game!");

        while (true) { 
            try {
                System.out.println("Choose Min!");
                numMin = input.nextInt();

                System.out.println("Choose Max!");
                numMax = input.nextInt();

                if (numMin < numMax) {
                    break;
                } else {
                    System.out.println("Range is not valid");
                }

            } catch (Exception e) {
                System.out.println("Input is not valid");

                input.next();
            }
            
        }

        int correctNum = randInt(numMin, numMax);
        int attempts = 0;

        System.out.println("Guess the number with a range of " + numMin + " - " + numMax + "!");

        while (true) { 
            try {
                int inputGuess = input.nextInt();

                attempts++;

                if (inputGuess == correctNum) {
                    System.out.println("Correct with " + attempts + " attempts!");
                    break;
                } else if (inputGuess > correctNum) {
                    System.out.println("Go Lower!");
                } else if (inputGuess < correctNum) {
                    System.out.println("Go Higher!");
                }
                
            } catch (Exception e) {
                System.out.println("Input is not valid!");

                input.next();
            }

        }

        input.close();
    }

    public static int randInt(int min, int max) {
        return rand.nextInt(min, max + 1);
    }

    public static double randDouble(double min, double max) {
        return rand.nextDouble() * (max - min) + min;
    }

}
