import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TODO LECTURE STUFF FOR 10/22
        String name = "Yo";
        System.out.printf("Hello, %s. Nice to see you.\n", name);

        String greet = "YO";
        String nombre = "MATT";
        System.out.printf("%s, %s", greet, nombre);

        System.out.print("\n Enter something: ");

//        String userInput = scanner.next(); Commented out to do next line
        String userInput = scanner.nextLine();

//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.printf("You entered %s", userInput);



    }
}
