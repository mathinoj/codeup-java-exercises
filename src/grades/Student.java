package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) { //constructor
        this.name = name;
        this.grades = new ArrayList<Integer>(); //The grades property should be an ArrayList of integers
//        ArrayList<Integer> grades = new ArrayList<Integer>();

    }

    //grades.add(10);
    //grades.add(13);

    // returns the student's name
    public String getName() {
        return name;
    }

    ;

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double getGradeAverage(){
        int grade = 0; //NEED VARIABLE TO STORE
        for (int i = 0; i < grades.size(); i++) {
            grade += grades.get(i);
            //for (Integer integer : grades) { ENHANCED FOR LOOP
            //            grade += integer; ENHANCED FOR LOOP
//            System.out.println(grades); IF YOU LEAVE THIS IN IT WILL PRINT OUT ArrayList MULTIPLE TIMES
        }
        int average = (grade / grades.size());
        System.out.println("Average = " + average);
        return average;
    }



    public static void main(String[] args) {

        Student x = new Student("X");
        x.addGrade(90);
        x.addGrade(80);
        x.addGrade(90);
//        System.out.printf("average =%d ", x.average());
        x.getGradeAverage();

//        System.out.println(grades);


    }
}
