public class ControlFlowExercises {
    public static void main(String[] args) {
//        Loop Basics

//        While
//        int i = 5;
//        while (i <=15 ){
//            System.out.print(" " + i);
//            i++;
//        }

//        Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//TODO
//int a = 0;
//        do{
//            System.out.println(a);
//            a += 2;
//        } while (a <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.
//TODO

//        int back = 100;
//        do{
//            System.out.println(back);
//            back -= 5;
//        } while (back >= -10);


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        long sq = 2;
//        do {
//            System.out.println(sq);
//            sq *= sq;
//        } while (sq < 1000000);


//TODO REFACTOR
//        for (int i = 5; i <= 15; i++){
//            System.out.print(" " +i);
//        }
//
//        for (int a = 0; a <= 100; a += 2){
//            System.out.println(a);
//        }
//
//        for (int b = 100; b >= -15; b -= 5){
//            System.out.println(b);
//        }

        for (long sq = 2; sq < 1000000; sq *= sq){
            System.out.println(sq);
        }




//for(int i = 0; i < 10; i += 1) {
//    System.out.println("i is " + i);
//}









    }
}
