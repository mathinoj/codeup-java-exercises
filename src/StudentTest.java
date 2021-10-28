public class StudentTest {
    public static void main(String[] args) {


        Student mcKenneth = new Student("mcKenneth mcHowell", "mcDeimos", 88.8);

//        System.out.println("mcKenneth.grade = " + mcKenneth.grade);

        System.out.println("mcKenneth.grade = " + mcKenneth.shareGrade());
        System.out.println("mcKenneth.name = " + mcKenneth.name);


//        Student samClemens = new Student("Samuel Clemens", "Mississippi", 95.3, "ADHD");
        Student samClems = new Student("Sam Clems", "Texas", 95.3, "7777");
        System.out.println("samClemens.studentDisclosure = " + samClems.shareDisclosure());

    }

}




