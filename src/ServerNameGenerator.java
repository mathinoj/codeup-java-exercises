import java.util.Arrays;

public class ServerNameGenerator {




    public static void random(String[] adjectives, String[] nouns){

    }

    public static void addPerson(Person[] people, Person newPerson){
        System.out.println(newPerson.getName());
        System.out.println(people[0].getName());

        System.out.println("people.length = " + people.length);
        Person[] nameplusone = Arrays.copyOf(people, people.length + 1);

        System.out.println("nameplusone.length = " + nameplusone.length);

        nameplusone[nameplusone.length-1] = newPerson;
        for(Person nombre : nameplusone){
            System.out.println(nombre.getName());
        }
    }

    public static void main(String[] arg) {
        String[] adjectives = {"Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp", "Charming", "Tasty", "Zealous"};
        String[] nouns = {"cat", "sock", "ship", "hero", "monkey", "baby", "match", "hair", "pizza", "Army"};
            System.out.println("nouns.length = " + nouns.length);
            System.out.println("adjectives.length = " + adjectives.length);
//        Person newElement = new String("%s-$s", adjectives, nouns);


    }

    //int numberOfBugs = (int) Math.floor(Math.random() * 100);
    //Bug[] myCode = new Bug[numberOfBugs];

}
//Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.
//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//Example Output
//
//
//Here is your server name:
//dedicated-photon