public class Person{
    private String name; //todo this IS A FIELD
//    private int age; // NEEDS TO BE DONE FOR EMPLOYEE, this was example, we changed it to the one below
    protected int age; // this was changed. Protected shares with superclass(ie PERSON class) and any of its subclasses(ie EMPLOYEE class)*********
    public String hello;

    public Person(){} //STEP 1 11/2 LEC we did this for the Employee class cuz it was yelling at us. Doing it like this is called a DEFAULT CONSTRUCTOR


    public Person(String name) {
        this.name = name; //I THINK WE DID THIS SO WE COULD RUN THE john EXERCISES BELOW
//        System.out.println("A Person is born!");
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
////TODO: return the person's name
        return name;
    }


    public void setName(String name) {
////TODO: change the name property to the passed value
        this.name = name;

    }


    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, there " + this.name);
    }


//  public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }



    public static void main(String[] args) {
//        Person matt = new Person ("Matthias");
//        System.out.println(("matt.name = " + matt.name));
        Person matt = new Person("Matthias");

        String mattName = matt.getName();
        String mattName2 = matt.name;
        System.out.println("mattName = " +mattName);
        System.out.println("mattName2 = " +mattName2);

        matt.setName("Matthias P");
        System.out.println("matt.getName() = " +matt.getName());

        matt.sayHello();

        //matt.name = "Matthias"; //might need comment out
        //System.out.println("matt = " + matt);//might need comment out
        //System.out.println(matt.name + " is my name!");//might need comment out



///////////////////////////////////////////PART 2 - UNDERSTANDING REFERENCES////////////////////////////////////////////

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        // todo first System.out is true because they have same name, which is what is being asked
        // todo second System.out is false because its not referencing name but instead is referencing the actual person, which is diff

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        // todo this is dealing with one person even though it looks like its two
        // TODO this is true cuz person1 is a new person named john, and person2 is the new person (aka john). So when we call the console 'person1 == person2' it is true cuz person1 (john) is the same as person2 (john). Ex. person1 = new Person(Jon X); person2 = person1 (aka Jon X); 'person1 == person2' is actually asking if Jon X == Jon X, which is TRUE.

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
        // todo this is dealing with one person (not two) but at the end its changing johns name to jane.
        // in way up above setName and Person must be established for all this to work
    }
}