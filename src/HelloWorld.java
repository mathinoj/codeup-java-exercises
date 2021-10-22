//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}

//THIS ONE BELOW WILL PRINT OUT ON TWO DIFFERENT LINES
//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello, ");
//        System.out.println("World!");
//    }
//}

//THIS WILL PRINT OUT HELLO WORLD MESSAGE ON SAME LINE
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello ");
        System.out.println("World!");




//Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 3;
        System.out.println("Your fave number is: " + myFavoriteNumber);

//Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "I am a string!";
        System.out.println("You are a what? " + myString);

//Change your code to assign a character value to myString. What do you notice?
//        myString = 'c';
//TODO java: incompatible types: char cannot be converted to java.lang.String. This would need double quotes instead ""

//Change your code to assign the value 3.14159 to myString. What happens?
//         myString = 3.14159;
//TODO java: incompatible types: double cannot be converted to java.lang.String

//Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//TODO with this above nothing comes up in the console

//        long myNumber;
//        System.out.println("Here is your number " + myNumber);
//TODO this is what comes up when I run the above code: java: variable myNumber might not have been initialized

//Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14;
//TODO java: incompatible types: possible lossy conversion from double to long. If we got rid of .14 then it will work

//Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//          System.out.println("Here is your number: " + myNumber);
// TODO this runs "Here is your number: 123"

//          myNumber = 123L;
//          System.out.println("Here is your number: " + myNumber);
// TODO java: This is what comes up like this: cannot find symbol; symbol:   variable myNumber; location: class HelloWorld

//         long myNumber = 123L;
//TODO java: incompatible types: possible lossy conversion from double to long, but this is with line 49 not being commented out
//TODO Instead it's more of a byte or short "type"

//Change your code to assign the value 123 to myNumber.
//        long myNumber = 123;
//       System.out.println("Here is your number: " + myNumber);
// TODO this runs "Here is your number: 123"

//Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
// TODO Probably cuz "long" is not for numbers that contain decimals

//Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14;
//TODO java: This^ is what happens^ incompatible types: possible lossy conversion from double to float

//        double myNumber = 3.14; OR float myNumber = 3.14F;
// TODO To fix this use 'double'


//What is the difference between the above code blocks? Explain why the code outputs what it does.
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
// TODO This will show 5 in one line and 6 in the other line

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
// TODO This will show 6 in one line and 6 in the other line

// Try to create a variable named class. What happens?
//        class myName = "Matthias";
// TODO this is what comes up => java: '{' expected. "CLASS" is already a keyword being used (@ top) so we cannot declare it as variable

//Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

// TODO THIS IS WHAT COMES UP WITH THE ^ ABOVE CODE: String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//  at HelloWorld.main(HelloWorld.java:100)

//How is the above example different from the code block below?
//        int three = (int) "three";
// TODO This is what happesn with ^: java: incompatible types: java.lang.String cannot be converted to int

//Rewrite the following expressions using the relevant shorthand assignment operators:
      //  int x = 4;
//        x = x + 5;
//        int x = 4;
//        x += 5;
//        System.out.println("x = " + x);

//        int x = 3;
//        int y = 4;
//        y = y * x;

//int x = 3;
//int y = 4;
//y *= x
// TODO rewritten above

//        int x = 10;
//        int y = 2;
////        x = x / y;
////        y = y - x;
//        x /= y;
//        y -= x;
//        System.out.println("y = " + y);
// TODO rewritten above


//What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

//        int number = 123456789100;
//        interger number is too large


//        int number = Interger.MAX_VALUE + 1;
//        // -123456789100
//        System.out.println(number);



    }
}

//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.print("Hello World!");
//    }
//}

//class HelloWorld {
//    public static void main(String[] args) {
//        System.out.print("Hello World!");
//    }
//}

