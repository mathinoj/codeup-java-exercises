import java.util.Scanner;

public class MethodsExercises {
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

    //todo THIS IS REFACTORED BY INTELLIJ
//        boolean confirm;
//        Scanner calcucorn = new Scanner(System.in);
//        do {
//            System.out.println("Enter two numbers:");
//            int num1 = calcucorn.nextInt();
//            int num2 = calcucorn.nextInt();
//            System.out.println("Would you like to add, subtract, multiply, divide, or modulus?");
//            String calculador = calcucorn.next();
//            switch (calculador) {
//                case "add" -> System.out.println(num1 + num2);
//                case "subtract" -> System.out.println(num1 - num2);
//                case "multiply" -> System.out.println(num1 * num2);
//                case "divide" -> System.out.println(num1 / num2);
//                case "divide" -> System.out.println(num1 % num2);
//                default -> System.out.println("Fine, then we won't calculate nathan.");
//            }
//            System.out.print("Do you want to continue to calculate [Y/N]");
//            confirm = calcucorn.next().equalsIgnoreCase(("y"));
//            calcucorn.nextLine();
//        } while(confirm);
    //todo the stuff ABOVE is REFACTORED BY INTELLIJ


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

//Create a method that validates that user input is in a certain range

//public static int getInteger(int min, int max);
//and is used like this:

//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);
//If the input is invalid, prompt the user again.

//    public static int getInteger(int min, int max) {
//        Scanner getInt = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
////        int userInput = getInteger(1, 10);
//        String get = getInt.nextLine();
//        int result = 1;
//        for (int i = 1; i <= max; i++){
//        result = result * min;
//    }
//    return result;


    public static int getInteger(int min, int max) {
        Scanner integer = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
//        for (int i = 1; i <= max; i++) {
        String getInt = integer.next();

        minMax(min, max, getInt);

        return userInput;
    }


    public static int minMax(int min, int max, String getInt) {
        if (max > 10) {
            System.out.print("Wrong");
//            return 1;

        } else{
//        return base * getPower(base, exponent - 1);
         System.out.println("Good");

    }
        return min;




}
}
