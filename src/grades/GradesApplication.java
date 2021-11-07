package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args){

        Student jon = new Student("jon");
        Student damon = new Student("damon");
        Student shaun = new Student("shaun");
        Student john = new Student("john");

        HashMap<String, Student> students = new HashMap<>();
        students.put("jonSean", jon);
        students.put("damonJon", damon);
        students.put("shaunJawn", shaun);
        students.put("johnJean", john);
        System.out.println("students = " + students);


//        Student grade = new grades(60);

//Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//It should have keys that are strings that represent github usernames, and values that are Student objects.


// usernames.put("Kenneth", "ken2cool"); //kenneth = keyDataType  ken2cool = valueDataType
//        usernames.put("Shanshan", "theGOAT");
//        usernames.put("Cody", "codynotTheDuck"); // this setup is called a key-value pair. First part is KEY, second part is VALUE
    }
}
