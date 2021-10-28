public class Person {
    // A class: This is the template or a blueprint for a "Person"

    //These below are instance variables
    public String firstName;
    public String lastName;
    public int age;


    //Below is instance method
    public String joinChat(){
        return lastName + ", " + firstName + " has joined the chat.";
    };

    public static void main(String [] args){
        Person matt = new Person();

        matt.firstName = "Matthias"; // this and the one below are part of the instance.
        matt.lastName = "Hinojosa"; // the instance is 'matt'; they have diff values 'first/last'; the properties are 'first/last'


        System.out.println("matt = " + matt); // this brings out matt = Person@36baf30c
        System.out.println(matt.firstName + " " + matt.lastName + " is my name!"); // todo These are the instance of the person
        System.out.printf("%s %s is my name.%n", matt.firstName, matt.lastName); // This way might be easier to write than the one above
        System.out.println(matt.joinChat()); // this brings out 'Hinojosa, Matthias has joined the chat.'
    }

}
