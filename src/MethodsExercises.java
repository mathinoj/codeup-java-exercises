import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] arg){

        boolean confirm;
        Scanner calcucorn = new Scanner(System.in);
        do {
        System.out.println("Enter two numbers:");
        double num1 = calcucorn.nextInt();
        double num2 = calcucorn.nextInt();
        System.out.println("Would you like to add, subtract, multiply, or divide?");
        String calculador = calcucorn.next();
        if (calculador.equals("add")) {
            System.out.println(num1 + num2);
        } else if (calculador.equals("subtract")){
            System.out.println(num1 - num2);
        } else if (calculador.equals("multiply")) {
            System.out.println(num1 * num2);
        } else if (calculador.equals("divide")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Then we won't calculate nathan, but this modulus: " + (num1 % num2));
        }
        System.out.print("Do you want to continue to calculate [Y/N]");
        confirm = calcucorn.next().equalsIgnoreCase(("y"));
            calcucorn.nextLine();
    } while(confirm);

        //todo THIS IS REFACTORED BY INTELLIJ
//        boolean confirm;
//        Scanner calcucorn = new Scanner(System.in);
//        do {
//            System.out.println("Enter two numbers:");
//            int num1 = calcucorn.nextInt();
//            int num2 = calcucorn.nextInt();
//            System.out.println("Would you like to add, subtract, multiply, or divide?");
//            String calculador = calcucorn.next();
//            switch (calculador) {
//                case "add" -> System.out.println(num1 + num2);
//                case "subtract" -> System.out.println(num1 - num2);
//                case "multiply" -> System.out.println(num1 * num2);
//                case "divide" -> System.out.println(num1 / num2);
//                default -> System.out.println("Then we won't calculate nathan.");
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






    }
}
