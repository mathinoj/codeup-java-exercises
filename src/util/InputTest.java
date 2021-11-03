package util;

public class InputTest {
    public static void main(String[] args) {
        //Since methods from 'Input java' are not static we have to create an 'input object', seen as below:
        Input input = new Input();

        // this is returning something so it has to be stored in a variable
        String myString = input.getString();
        System.out.println("myString = " + myString);

        System.out.println("Do you like stuff?");
        boolean likeStuff = input.yesNo();
        System.out.println("likeStuff = " +likeStuff);

        System.out.println("Enter a number, but none with decimals.");
        int newInt = input.getInt();
        System.out.println("newInt = " +newInt);

        int newInt2 = input.getInt(1, 100);
        System.out.println("newInt2 = " +newInt2);

        System.out.println("Enter a decimal number");
        double decDub = input.getDouble();
        System.out.println("decDub = " +decDub);

        double decDub2 = input.getDouble(1, 100);
        System.out.println("decDub2 = " +decDub2);
    }
}
