package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args){
        System.out.println("Welcome");
        System.out.println("Here are the GitHub usernames of our students: ");
        System.out.println("|jonSean| |damonJon| |shaunJawn| |johnJean|");
        System.out.println("What student would you like to see more information on?");
        Scanner personSelect = new Scanner(System.in);
        if(personSelect.equals("jonSean"))
            System.out.println("hello");



        Student jon = new Student("jonGrade");
        Student damon = new Student("damon");
        Student shaun = new Student("shaun");
        Student john = new Student("john");

//        int[] jonGrades = {71, 82, 83, 94, 75};
//        int[] damonGrades = {91, 92, 53, 74, 85};
//        int[] shaunGrades = {8, 72, 63, 84, 95};
//        int[] johnGrades = {61, 72, 83, 84, 85};
//        System.out.println(Arrays.toString(jonGrades));
//        System.out.println(Arrays.toString(damonGrades));
//        System.out.println(Arrays.toString(shaunGrades));
//        System.out.println(Arrays.toString(johnGrades));

//        Student jonGrades = new int[71, 82, 83, 94, 75];
//        Student damonGrades = {91, 92, 53, 74, 85};
//        Student shaunGrades = {8, 72, 63, 84, 95};
//        Student johnGrades = {61, 72, 83, 84, 85};

        HashMap<String, Student> students = new HashMap<>(); //Inside the main method, create a HashMap named students
        students.put("jonSean", jon);
        students.put("damonJon", damon);
        students.put("shaunJawn", shaun);
        students.put("johnJean", john);
        System.out.println("students = " + students);
        //It should have keys that are strings that represent github usernames, and values that are Student objects.


//        Student
//        int[] jonGrades = {71, 82, 83, 94, 75};
//        int[] damonGrades = {91, 92, 53, 74, 85};
//        int[] shaunGrades = {8, 72, 63, 84, 95};
//        int[] johnGrades = {61, 72, 83, 84, 85};
        //Create at least 4 Student objects with at least 3 grades each, and add them to the map.

//        students.put("jonSean", jonGrades);
//        HashMap<Integer, Integer> grades = new HashMap<>();
//        grades.put(70, 70);
//        System.out.println(grades);



//        int grades[] = new int[90];
//        int marks[] = new int[6];

//        Student grade = new grades(60);

// usernames.put("Kenneth", "ken2cool"); //kenneth = keyDataType  ken2cool = valueDataType
//        usernames.put("Shanshan", "theGOAT");
//        usernames.put("Cody", "codynotTheDuck"); // this setup is called a key-value pair. First part is KEY, second part is VALUE
    }
}
