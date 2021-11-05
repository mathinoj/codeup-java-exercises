import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to number guessing game.");
        int myNumber = (int)Math.floor(Math.random() * 100);

        int userInput;

        System.out.println("Guess the number");

        do{

            System.out.println("Choose number between 1-100");
            userInput = scanner.nextInt();

            if(userInput > myNumber){
                System.out.println("Lower");
            }else if(userInput < myNumber){
                System.out.println("Higher");
            }else{
                System.out.println("Good job");
            }
        }while (userInput != myNumber);
    }







}
