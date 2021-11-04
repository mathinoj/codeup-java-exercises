import java.sql.SQLOutput;
import java.util.Arrays;

public class ServerNameGenerator {
    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    public static String[] adjectives = {"Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp", "Charming", "Tasty", "Zealous"};
    public static String[] nouns = {"cat", "sock", "ship", "hero", "monkey", "baby", "match", "hair", "pizza", "Army"};

    //the parameter we will pass will be an ARRAY OF STRINGS
    public static String randomElement(String[] adjNou) {
        //FROM CURRICULUM - Create a method that will RETURN a random element from an array of strings. LOOK AT 'RETURN'****
        return adjNou[(int) Math.floor((Math.random() * (adjNou.length - 1)))];
        //to generate 0-1 to include decimals you do Math.random
        //Math.floor will return a double so instead you have to put the '(int)' before 'Math.floor'

    }

    ////////////////////////////////FIRST DO ALL THE STUFF THAT IS ABOVE, THEN DO BELOW/////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("Server name is: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
//g
}
