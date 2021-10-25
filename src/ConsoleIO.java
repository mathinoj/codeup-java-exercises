import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //TODO LECTURE STUFF FOR 10/22
//        String name = "Yo";
//        System.out.printf("Hello, %s. Nice to see you.\n", name);
//
//        String greet = "YO";
//        String nombre = "MATT";
//        System.out.printf("%s, %s", greet, nombre);
//
//        System.out.print("\n Enter something: ");
//
////        String userInput = scanner.next(); Commented out to do next line
//        String userInput = scanner.nextLine();
//
////        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        System.out.printf("You entered %s", userInput);

// TODO LECTURE STUFF FOR 10/25

//        boolean isSunny = false;
//        boolean hasUmbrella = false;
//        boolean isSunny = true;
//        boolean hasUmbrella = true;
//        boolean isSunny = true;
//        boolean hasUmbrella = false;
        boolean isSunny = false;
        boolean hasUmbrella = true;

        if (isSunny){
            System.out.println("enjoy sun");
        }
        else if (!isSunny && hasUmbrella){
            System.out.println("watch for rain");
        }
        else {
            System.out.println("go check weather");
        }


//        int caseSwitch = 1;
//        int caseSwitch = 2;
        int caseSwitch = 3;
//        char userInput = 'y';
//        String userInput = "Yes";


        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
            case 2:
//            case 'y':
                System.out.println("Case 2");
                break; //IF YOU DIDNT PUT THIS BREAK THEN IT WILL fall through ALL THINGS (case1, case2, & default case).
//            case 'y':
//                System.out.println("Case 2");
//                break;
            default:
                System.out.println("Default case");
                break;
        }


//        char userInput = 'n';
//        do {
//            System.out.println("du hast");
//        }

//        char userInput = 'n'; //todo YOU WONT WANT TO PUT 'y' CUZ IT WOULD RUN INFINITE LOOP
//        do {
//            System.out.println("du hast");
//        } while (userInput == 'y');
//
//        while (userInput == 'y'){
//            System.out.println("du hast again");
//        }


        // print the numbers 1 through 5

        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 15) {
//                if (i % 2 == 0) {
                if (i % 2 != 0) {

                continue;
//                break;
            }
            System.out.println(i);

        }








    }
}
