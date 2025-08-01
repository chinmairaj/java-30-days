import java.util.Random;
import java.util.Scanner;
public class project2 {
    public static void main(String[] args){
        Random r = new Random();
        int secretNumber=r.nextInt(100)+1;
        Scanner s = new Scanner(System.in);
        int numberofAttempts=3;
        System.out.println("\n*******************");
        System.out.println("wellocome to Number Guessing Game");
        System.out.println("*******************\n");
        System.out.println("choose the diffculty level(easy\\medium\\hard):");
        String diffcultyLevel=s.next().toLowerCase();
        if(diffcultyLevel.equals("easy")){
            numberofAttempts=3;
        }
        else if(diffcultyLevel.equals("medium")){
            numberofAttempts=5;
        }
        else if (diffcultyLevel.equals("hard")){
            numberofAttempts=10;
        }
        else {//case4
            numberofAttempts=-1;
        }
        System.out.println("you have "+numberofAttempts+"attempts to guess the number");
        while(numberofAttempts>0){
            System.out.println("guess the number(1-100)");
            int guess = s.nextInt();
            if(guess<1 || guess>100){
                System.out.println("invalid number.please enter a number between 1 and 100");
                continue;
            }
            if(guess==secretNumber){
                System.out.println("you have guessed the correct number!you won");
            break;
            }else{
                if(guess<secretNumber){
                    System.out.println("to low. try again...");
                }else{
                    System.out.println("too high. Try again");
                }
                numberofAttempts--;
                System.out.println("you have "+numberofAttempts+"attempts left to guess the number");
            }
            if(numberofAttempts==0){
                System.out.println("you lose game try again");
                System.out.println(" The correct number was" +secretNumber);
            }
            String playAgain;
            do{
                System.out.println(" Do you want to playAgain (yes/no):");
                s.nextLine();
                playAgain=s.next().toLowerCase();
            } while(playAgain.equals("yes"));
                    System.out.println("thanks for playing !");

    }
}
}
    

