import java.util.Scanner;
import java.util.Random;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int Min_Number = 1;
        int Max_Number = 100;
        int Max_Attempts = 10;
        int Score = 0;

        System.out.println("NUMBER GAME START");
        while (true) {
            int Generated_Number = random.nextInt(100);
            int Attempts = 0;
            int Guess_Number;
            while (Attempts < Max_Attempts) {
                System.out.println("\nENTER YOUR NUMBER TO GUESS THE GENERATED NUMBER : ");
                Guess_Number = sc.nextInt();
                Attempts++;

                if (Guess_Number < Generated_Number) {
                    System.out.println("ENTERED NUMBER IS SMALLER THAN THE GENERATED NUMBER !\nTRY AGAIN ");
                } else if (Guess_Number > Generated_Number) {
                    System.out.println("ENTERED NUMBER IS GREATER THAN THE GENERATED NUMBER !\nTRY AGAIN");
                } else {
                    System.out.println("YOU HAVE GUESSED THE RIGHT NUMBER" + Generated_Number + " in " + Attempts + " attempts");
                    Score++;
                    break;
                }

                if (Attempts == Max_Attempts) {
                    System.out.println("YOU HAVE REACHED THE LIMITS TO FIND THE GENERATED NUMBER.THE CORRECT NUMBER IS : "
                    +Generated_Number);
                }

            }
            System.out.println("DO YOU WANT TO PLAY AGAIN ?\n  Yes/No :");
            String play_more = sc.next().toLowerCase();

            if (!play_more.equals("yes")) {
                System.out.println("YOUR SCORE IS : " +Score+ " IN NUMBER OF ATTEMPTS :" + Attempts);
                break;
            }
        }
        sc.close();
    }
}
