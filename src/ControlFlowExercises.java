import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Loop Basics

//        While
//        int i = 5;
//        while (i <=15 ){
//            System.out.print(" " + i);
//            i++;
//        }

//        Do While
//TODO
//int a = 0;
//        do{
//            System.out.println(a);
//            a += 2;
//        } while (a <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.
//TODO

//        int back = 100;
//        do{
//            System.out.println(back);
//            back -= 5;
//        } while (back >= -10);


//        long sq = 2;
//        do {
//            System.out.println(sq);
//            sq *= sq;
//        } while (sq < 1000000);


//TODO REFACTOR
//        for (int i = 5; i <= 15; i++){
//            System.out.print(" " +i);
//        }
//
//        for (int a = 0; a <= 100; a += 2){
//            System.out.println(a);
//        }
//
//        for (int b = 100; b >= -10; b -= 5){
//            System.out.println(b);
//        }

//        for (long sq = 2; sq < 1000000; sq *= sq){
//            System.out.println(sq);
//        }


//Fizzbuzz

//        for (int i = 1; i < 100; i++) {
//            if (((i % 3) == 0) && ((i % 5) == 0))
//                System.out.println("fizzbuzz");
//            else if ((i % 3) == 0)
//                System.out.println("fizz");
//            else if ((i % 5) == 0)
////                continue;
//                System.out.println("buzz");
//            else
//                System.out.println(i);
//        }


// todo TRISTAN WAY**********************
//for (int z = 1; z < 100; z++){
//    boolean divBy3 = (z % 3) == 0;
//    boolean divBy5 = (z % 5) == 0;
//    if (divBy3 && divBy5) {
//        System.out.println("FizzBuzz");
//    } else if (divBy5) {
//        System.out.println("Buzz");
//    } else if (divBy3) {
//        System.out.println("Fizz");
//    } else {
//        System.out.println(z);
//    }
//}

        //Display a table of powers.
        //
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        //Example Output

        boolean yayNay;
        Scanner userInt = new Scanner(System.in);
//        num = sc.nextInt();

        do {
            System.out.print("Enter number: ");
            int userNumber = userInt.nextInt();
//        System.out.println("Your number is:" + userNumber + ".");
            System.out.println("Number | Squared | Cubed"); //YOU HAD printf
            System.out.println("------ | ------- | -----");
            for (int y = 1; y <= userNumber; y++) {
                System.out.printf("%-7d|%-9d|%-6d\n", y, (y * y), (y * y * y)); //YOU ORIGINALLY HAD println
            }
            System.out.print("Do you want to continue: [Y/N]");
            yayNay = userInt.next().equalsIgnoreCase(("y"));
        } while (yayNay);

//            boolean yayNay;
//            Scanner userGo = new Scanner(System.in);
//            do{
//            System.out.print("Do you want to continue: [Y/N]");
//                yayNay = userGo.next().equalsIgnoreCase(("y"));
//            } while (yayNay);

        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.


//Scanner sc = new Scanner(System.in);
//System.out.print("Continue? [y/N] ")
//String userInput = sc.next();
//
//// Don't do this!
//boolean confirmation = userInput == "y";


//        todo userInt.close();**************** put this at end
        boolean confirm;
        Scanner grade = new Scanner(System.in);
        do {
            System.out.print("Enter number grade: ");
            int userGrade = grade.nextInt();
            if (userGrade < 60) {
                System.out.println("F");
            } else if (userGrade < 67) {
                System.out.println("D");
            } else if (userGrade < 80) {
                System.out.println("C");
            } else if (userGrade < 90) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
            System.out.print("Do you want to continue: [Y/N]");
            confirm = grade.next().equalsIgnoreCase(("y"));
        } while (confirm);


    }
}
