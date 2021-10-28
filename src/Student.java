public class Student {
    public String name;
    public String cohort;
    private double grade;
    private String studentDisclosure;

    public double shareGrade(){
        return grade; //this allows access
    }


    public String shareDisclosure(){
        return studentDisclosure;
    }

    //Lets add a constructor, which is a METHOD OF OBJECT CREATION

    public Student(String studentName){
//        name = studentName;
//        cohort = "Unassigned";

        //Calling constructor inside a constructor. WHEN we run this everything acts as if nothing has changed
        //You need the other constructor as (below this one) as well
        this(studentName, "Unassigned");
    }

    public Student(String studentName, String studentCohort){
//        name = studentName;
//        cohort = studentCohort;
        this.name = studentName; //'this.' refers the current instance(this object); 'this.' can solve ambiguous variable names
        this.cohort = studentCohort; //'this.' can call other constructors, but it must be first statement in the constructor

    }

    public Student(String studentName, String studentCohort, double grade){
        this.name = studentName;
        this.cohort = studentCohort;
        this.grade = grade;

    }

    public Student(String studentName, String studentCohort, double grade, String studentDisclosure){
        this.name = studentName;
        this.cohort = studentCohort;
        this.grade = grade;
        this.studentDisclosure = studentDisclosure;

    }






    public static void main(String[] args){
        //Before constructors: [similar feel to JS]
//        Student x = new Student();
//        x.name = "Ron";
//        x.cohort = "TTU";
//
//        System.out.println(x.name + " is in the " + x.cohort + " cohort");


        //First constructor experiment:
        Student ray = new Student("Ray");

        System.out.println(("ray.name = " + ray.name));
        System.out.println(("ray.name = " + ray.name + "ray.cohort" + ray.cohort)); // at first when we run this COHORT doesnt come up cuz there was nothing assigned to it. //todo HOWEVER we just added something to it so it runs correctly based off the parameter we set

        //Second constructor experiment:
        Student joe = new Student("Joe", "TTX");
        System.out.printf("%s is the student name and %s is their assigned cohort", joe.name, joe.cohort);

//        Student masuhh = new Student("masuhh", + masuhh.grade);

        Student mcKenneth = new Student("mcKenneth mcHowell", "mcDeimos", 88.8);

        System.out.println("mcKenneth.grade = " + mcKenneth.grade);





    }

}
