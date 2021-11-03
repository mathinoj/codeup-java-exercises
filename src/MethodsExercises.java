import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
    //todo YOUR ANSWER TO EXERCISE ONE

//    public static void main(String[] arg) {
//
//        boolean confirm;
//        Scanner calcucorn = new Scanner(System.in);
//        do {
//            System.out.println("Enter two numbers:");
//            double num1 = calcucorn.nextInt();
//            double num2 = calcucorn.nextInt();
//            System.out.println("Would you like to add, subtract, multiply, divide, or modulus?");
//            String calculador = calcucorn.next();
//            if (calculador.equals("add")) {
//                System.out.println(num1 + num2);
//            } else if (calculador.equals("subtract")) {
//                System.out.println(num1 - num2);
//            } else if (calculador.equals("multiply")) {
//                System.out.println(num1 * num2);
//            } else if (calculador.equals("divide")) {
//                System.out.println(num1 / num2);
//            } else if (calculador.equals("modulus")) {
//                System.out.println(num1 % num2);
//            } else {
//                System.out.println("Fine, then we won't calculate nathan.");
//            }
//            System.out.print("Do you want to continue to calculate [Y/N]");
//            confirm = calcucorn.next().equalsIgnoreCase(("y"));
//            calcucorn.nextLine();
//        } while (confirm);

    //todo Above is YOUR ANSWER TO EXERCISE ONE



    //todo from LINE BELOW is from Casey Edwards
//    public static void calculateUserInput(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Gimme two numbers: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println("Would you like to add, subtract, multiply, or divide?");
//        String input = scanner.next();
//
//        calculate(num1, num2, input);
//    }
//
//    public static void calculate(int num1, int num2, String input){
//        switch (input) {
//            case "add":
//                System.out.println("Sum: " + add(num1, num2));
//                break;
//            case "subtract":
//                System.out.println("Difference: " + (num1 - num2));
//                break;
//            case "multiply":
//                System.out.println("Product: " + (num1 * num2));
//                break;
//            case "divide":
//                System.out.println("Dividend: " + (num1 / num2));
//                break;
//            default:
//                System.out.println("idk how we got here, fam");
//                break;
//        }
//    }
//    public static int add(int num1, int num2){
//        return num1 + num2;
//    }
//}
// todo from LINE ABOVE is from Casey Edwards

//    public static int add(int num1, int num2){
//        return num1 + num2;
//    }
//    public static int subtract(int num1, int num2){
//        return num1 - num2;
//    }
//    public static int multiply(int num1, int num2){
//        return num1 * num2;
//    }
//    public static int divide(int num1, int num2){
//        return num1 / num2;
//    }
//    public static int modulus(int num1, int num2){
//        return num1 % num2;
//    }
//
//    public static void main(String[] args){
//        System.out.println("Add = " +add(1, 1));
//        System.out.println("Subtract = " +subtract(5, 4));
//        System.out.println("Multiply = " +multiply(5, 4));
//        System.out.println("Divide = " +divide(8, 4));
//        System.out.println("Modulus = " +modulus(5, 4));
//    }

//public class Main { //TODO the STUFF BELOW is overloading
//    public static void main(String[] arg){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//
//        public static int add(int num1, int num2){
//            return num1 + num2;
//        }
//        public static int add(int num1, int num2, int num3){
//            return num1 + num2 + num3;
//        }
//        public static int add(double num1, double NUMBER_BAD, double idkMaybeANum){
//
//            return (int) (num1 + NUMBER_BAD + idkMaybeANum);
//        }
//
//    }
//}
//TODO the STUFF ABOVE is overloading

    public static int getInteger(int min, int max){
        Scanner intScan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNum = intScan.nextInt();
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Number not between 1-10. Enter another number: ");
        return getInteger(min, max);
    }


//    public static void main(String[] args){
//        System.out.println(getInteger(1, 10));
//    }

    //TODO **************************STOPPED AT 11MIN ********************************
//1! = 1               = 1
//2! = 1 x 2           = 2
//3! = 1 x 2 x 3       = 6
//4! = 1 x 2 x 3 x 4   = 24


    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        int userInput;
        String isContinue;
        long factorial = 1; //all factorials start at one (i think just for this case)
        String middle = "1";

        //all hard logic will be in a do-while loop cuz we are going to ask user if they want to continue the functionality after factorials have been printed out
        do{
            userInput = getInteger(1, 10); // now that we have number from user we need to get through our factorial by doing a for loop
            for(int i = 1; i <= userInput; i++){
                if(i > 1){
                    middle += "x" + i;
                }
                factorial *= i; // 1 is the iterator

                System.out.printf("%2d! = %-45s = %d%n", i,middle,factorial); //'%2d!'=number(i) and !, the 2 adds 2 spaces if its positive(opposite for negative); the -45 gives the space between the '!' and the far left result of multiplication result
            }
            System.out.println("Will you like to continue? [Y/N]");
            isContinue = scanner.nextLine();
        }while (isContinue.equalsIgnoreCase("y"));
    }


    public static void dice(){
        Scanner sc = new Scanner(System.in);
        String answer;
        System.out.println("How many sides you want your dice to have?"); //now that we asked the question we can store the number in an int
        int sides = sc.nextInt(); // this will get the int from the user
        System.out.println("Roll the dice? [Y/N]");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("y")){
            do {
                int dice1 = (int) Math.floor(Math.random() * sides);
                int dice2 = (int) Math.floor(Math.random() * sides); //math.random generates random number, but it generates a float so some of the numbers would not be integers, therefore we use math.floor which rounds down to the nearest integer. However math.floor returns a double, but we need an integer so we need to force the math.floor into an integer in order to store this into the dice for a clean dice roll.
                System.out.println(dice1);
                System.out.println(dice2);
                System.out.println("Would you like to roll again: [Y/N]");
                answer = sc.next();
            }while(answer.equalsIgnoreCase("y"));
        }
    }


    public static void main(String[] args){
        System.out.println(getInteger(1, 10));

        factorial();

        dice();
    }
}
//}
