package util;

import java.util.Scanner; //STEP 2

public class Input {
    private Scanner scanner; // STEP 1 - from curriculum 'has private property named scanner'
    //adding the above 'Scanner' class will require you to 'import java.util.Scanner' which can be done by clicking 'Scanner'

    //below is a constructor
    // STEP 3
    //from the curriculum 'When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.'
    //that just means we need to make a constructor, which we make to create an INSTANCE
    public Input() {
        scanner = new Scanner(System.in); //THIS is a new instance. Curriculum says 'the scanner field should be set to a new instance of the Scanner class'
    }

    String getString() { //this is a method
        System.out.printf("Enter a string."); // this could also be asked in the InputTest Java class
        return scanner.nextLine(); // I DONT KNOW WHY SHAN DID THIS BUT SHE SAID AT LEAST THE ERROR GOES AWAY
    }

    boolean yesNo() { //this is a method
        //from curriculum 'The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.'
        String userInput = scanner.nextLine(); //This stores the userInput into the variable cuz it compares with y/yes
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    int getInt(int min, int max) { //this is a method. THIS getINT and the one below are considers method overloading cuz they have different amounts of parameters, and usually the ones with the most parameters are below the one with the least
        //FROM CURRICULUM - The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
        int userInt; // STEP 3**
        do { // STEP 5**
            System.out.printf("Enter a number between %d and %d: %n", min, max); // for this method this was STEP 1**
            userInt = scanner.nextInt(); // STEP 2**
        } while (userInt > max || userInt < min);// STEP 6**
        return userInt;  // STEP 4**
    }


    int getInt() { //this is a method
        return scanner.nextInt();
    }


    double getDouble(double min, double max) { //this is a method
        Double userDouble;
        do {
            System.out.printf("Enter a decimal number between %f and %f: %n", min, max); //we use %f for DOUBLES!!!!!!
            userDouble = scanner.nextDouble();
        } while (userDouble > max || userDouble < min);
        return userDouble;
    }


    public double getDouble() { //this is a method
        return scanner.nextDouble();
    }
}
