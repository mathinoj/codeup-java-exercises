import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.println(pi);

//  System.out.printf("Your Pi will cost: %s", pi);

        System.out.format("Your Pi will cost: %.2f%n", pi);


//TODO *****Explore the Scanner Class.******

        System.out.print("Enter integer here: ");
        int userNum = scanner.nextInt();
        System.out.println("You entered:" + userNum + ".");

        Scanner scanner = new Scanner(System.in);
//        MIGHT NEED TO UNCOMMENT THIS

        System.out.print("Enter 3 words here: ");
//        String userInput = scanner.next(); //TODO THIS WILL NOT OUTPUT A WHOLE SENTENCE, INSTEAD IT WILL STOP AT FIRST WORD OF SENTENCE
//        System.out.println("You entered: -->" + userInput + "<--");

        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();
//        System.out.println("You entered: -->" + userInput + "<--");  <== HOW I DID
        System.out.printf("1: %s\n2: %s\n3: %s", wordOne, wordTwo, wordThree);



        System.out.print("Enter a full sentence here: ");
        String userInput2 = scanner.nextLine(); // TODO THIS WILL OUTPUT WHOLE SENTENCE
        System.out.println("You entered: --> \"" + userInput2 + "\" <--");


        //TODO *****Calculate the perimeter and area of Codeup's classrooms.*****

        System.out.print("Enter Width (in feet) here: ");
        int userWidth = scanner.nextInt();
        System.out.println("You entered: --> \"" + userWidth + "\" <--");

//        String widthString = scanner.nextLine(); THESE TWO LINES IS HOW YOU WOULD DO IF IT WAS A STRING
//        int width = Integer.parseInt(widthString);

        System.out.print("Enter Length (in feet) here: ");
        int userLength = scanner.nextInt();
        System.out.println("You entered: --> \"" + userLength + "\" <--");

        System.out.print("Enter Height (in feet) here: ");
        int userHeight = scanner.nextInt();
        System.out.println("You entered: --> \"" + userHeight + "\" <--");

//        int width = userWidth;
//        int length = userLength;
//        int area = userWidth * userLength;
//        int perimeter = (userWidth*2) + (userLength*2);
//                System.out.println("area = " + area);
//                System.out.println("perimeter = " + perimeter);
        System.out.println("Area = " + userWidth * userLength);
        System.out.println("Perimeter = " + ((userWidth*2) + (userLength*2)));
        System.out.println("Volume = " + (userLength * userWidth * userHeight));



//Integer.valueOf() and Integer.parseInt()
    }
}


//        Prompt the user to enter values of length and width of a classroom at Codeup.
//
//        Use the nextLine method to get user input and parse the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//        Display the area and perimeter of that classroom.
//
//        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.