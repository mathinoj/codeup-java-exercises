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


    public static void main(String[] args){
        System.out.println(getInteger(1, 10));
    }

    //TODO **************************STOPPED AT 11MIN ********************************




}
//}
