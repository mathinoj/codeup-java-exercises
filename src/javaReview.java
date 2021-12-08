//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class javaReview {

//
//    //Write a public static method named cubed that accepts an integer as an argument and returns that integer to the third power.
//    public static int cubed(int arg) {
//        return arg * arg * arg;
//    }
//
//    //Write a public static method named difference that accepts two arguments and that works with both integers and doubles (use method overloading). Both variations of the method should return the result of subtracting the second argument from the first argument.
////   public static int difference(int first, int second){
//    public static double difference(double first, double second) {
//
//        return first - second;
//    }
//
//    //Write a public static method named median that receives an array of ints (please use an array, not a Collection) and returns the median as a double.
//
//    public static double median(int[] arr) {
//        Arrays.sort(arr);
//        double median;
//        if (arr.length % 2 == 0) {
//            median = ((double) arr[arr.length / 2] * (double) arr[arr.length / 2 - 1]) / 2;
//        }else{
//            median = (double) arr[arr.length/2];
//        }
//        return median;
//    }
//
//    public static boolean isUpperCase(String s)
//    {
//        for (int i=0; i<s.length(); i++)
//        {
//            if (!Character.isUpperCase(s.charAt(i))) //the only immediately available method when using java is this, but it doesn't accepts strings it only accepts one character at a time and returns true or false so with this method it accepts a string and itterates through it using a for loop. if it encounters a lowercase character then it will return false, meaning that everything else isn't uppercase. but if it gets to end and there are all uppercase letter then it will return true, which means the string is all uppercase.
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    //This method should:
//    //
//    //Receive an ArrayList of Cat objects as a parameter.
//    //The method should return an ArrayList of Cat objects, where each Cat object's color field is in uppercase.
//
////return type is: ArrayList<Cat>, and it receives an array list as: ArrayList<Cat> cats
//public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats){ //On your AssessmentReview class create a static method named uppercaseCatColor.     //Receive an ArrayList of Cat objects as a parameter. <(THIS IS FOR ABOVE AS WELL)
//
//    for(Cat cat : cats){
//            if(isUpperCase(cat.getColor())){
//                continue;
//            }else{
//                String newColor = cat.getColor().toUpperCase();
//                cat.setColor(newColor);
//            }
//        }
//
//}
//
//
//
//    public static void main(String[] args) {
//
//
//        System.out.println(cubed(3));
//        System.out.println(difference(10,5));
//        System.out.println(difference(10.5, 5.7)); //doing double allows you to use decimals like this
//        System.out.println(median(new int[]{1,3,4,2,6,5,8,7}));
////        System.out.println(median(new int[]{2,20,3,7,7,5,8,7,10,0}));
////        System.out.println(median(new int[]{2,20,3,7,7,5,8,7,10,0}));
//        int[] arr = {2,20,3,7,7,5,8,7,10,0};
//        System.out.println(median(arr));
//
//    }
//}
//
////Create a class named Pet inside of java.
////If the passed name argument is null, the constructor should throw an IllegalArgumentException.
//
//public class Pet{ //The class should define three fields. One of type int named age, one of type boolean named isRescue, and one of type String named name. These fields should not be accessible outside the Pet class.
//    private int age;
//    private boolean isRescue;
//    private String name;
//
//    public Pet(int age, boolean isRescue, String name){//Add a constructor method that has three parameters of the types above and sets age ,isRescue, and name properties based on the respective parameters.
//
//        this.age = age;
//        this.isRescue = isRescue;
//        this.name = name;
//    }
//
//    public int getAge(){//Write getters and setters for all three fields.
//        return age;
//    }
//
//    public boolean getIsRescue(){
//        return isRescue;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public boolean isRescue() {
//        return isRescue;
//    }
//
//    public void setRescue(boolean rescue) {
//        isRescue = rescue;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//public class Cat extends Pet implements Meowable {
//    private String color;
//
//    public Cat(int age, boolean isRescue, String name, String color) {
//        super(age, isRescue, name);
//        this.color = color;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public void meow() {
//        System.out.println("This is a meow");
//    }
//
//    public static void main(String[] args) {
//        Cat kitty = new Cat(3,true,"penny","bronze");
//
//        kitty.meow();
//    }
//}
//
//
//
//public class Dog extends Pet{ //Create a class named Dog inside of java that also inherits from Pet.
//    private String breed;//Add a private field named breed that is a String. This field represents the breed of each instance of Dog.
//
//    public dog(int age, boolean isRescue, String name, String breed){ //Write the constructor on Dog that has 4 parameters: the age of the dog, a boolean indicating whether the dog is a rescue, what the dog's name is, and the breed of the dog.
//        super(age, isRescue, name); //The corresponding fields of the object should be set based on the arguments passed to the constructor. (Hint: use of the super constructor may be useful here)
//        this.breed = breed;
//    }
//    public String getBreed(){//Write a getter and setter on the Dog class for the breed property.
//        return breed;
//    }
//    public void setBreed(String breed){//Write a getter and setter on the Dog class for the breed property.
//        this.breed = breed;
//    }
//
//}
//
//
//
////
////The implementation of the meow method on Cat class should print the following message:
////This is a meow
////create INTERFACE > instead of java class you choose 'interface'
//public interface Meowable{ //Create an interface named Meowable inside of java.
//    public void meow(); //The Meowable interface should specify a public abstract method named meow that accepts no arguments and returns nothing.
//
//}
//
////Change your Cat class so that it implements the Meowable interface.
////TODO for this you'd go to the 'public class Cat extends Pet{' = public class Cat extends Pet implements Meowable{
////todo AFTER you add the 'implements Meowable' you can choose 'implement methods' which will bring up 'meow():void'
////todo the 'meow():void' will bring up the the following:
//// @Override
//// Public void meow(){
//// System.out.printlin("This is a meow");
//// }
////TODO AFTER THE ABOVE WE DO THE BELOW
////    public static void main(String[] args) {
////        Cat kitty = new Cat(3, true, "penny", "bronze");
////
////        kitty.meow();
////    }
//
//
////Bork bork!
//public interface barkable(){//Create an interface named Barkable inside of java.
//
//    public void bark();//The Barkable interface should specify a public abstract method named bark that accepts no arguments and returns nothing.
//
//}
//
////public class gof extends Pet implements Barkable{ //todo Change your Dog class so that it implements the Barkable interface.
//// @Override
//// Public void bark(){ //todo The implementation of the bark method on the Dog class should print the following message:
//// System.out.printlin("Bark bark");
//}