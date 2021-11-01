public class Person{
    private String name;
    public String hello;

    public Person(String name) {

        this.name = name;
//        System.out.println("A Person is born!");

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
////TODO: print a message to the console using the person's name
//        return String.format("Hello from %s!", this.name);
//        return String.format("Hello from %s!", name);

        this.hello = hello;

    }


//  public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }



    public static void main(String[] args) {
//        Person matt = new Person ("Matthias");
//        System.out.println(("matt.name = " + matt.name));
        Person matt = new Person("Matthias");
        matt.name = "Matthias";
        System.out.println("matt = " + matt);
        System.out.println(matt.name + " is my name!");
//        System.out.printf("%s is my name.%n", matt.name);
//        System.out.println(this.name.sayHello());




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

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        // todo this is dealing with one person (not two) but at the end its changing johns name to jane.
        // in way up above setName and Person must be established for all this to work
    }
}