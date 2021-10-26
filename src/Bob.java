import java.util.Scanner;

public class Bob {
    public static void main(String[] arg) {
        //Bob is a lackadaisical teenager. In conversation, his responses are very limited.

        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.
        //Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        //USE SCANNERS LOOPS, ETC

        boolean confirm;
        Scanner bob = new Scanner(System.in);
        do {
            System.out.print("Ask Bob anything or just talk to him: ");
            String ask = bob.nextLine();
//        System.out.println("You entered: --> \"" + ask + "\" <--");
            if (ask.endsWith("?")) {
                System.out.println("Sure.");
            } else if (ask.endsWith("!")) {
                System.out.println("Whoa, chill out brah!");
            } else if (ask.equals("")) {
                System.out.println("Fine. Be's that guey!");
            } else {
                System.out.println("Whatevz");
            }
            System.out.print("Do you want to continue to talk Bob: [Y/N]");
            confirm = bob.next().equalsIgnoreCase(("y"));
            bob.nextLine();
        } while(confirm);

        // String userInput2 = scanner.nextLine();

////String austinSentence = "The capital city of Texas is " + txCapitalCity + ", and it is growing quickly.";

//        boolean confirm;
//        Scanner grade = new Scanner(System.in);
//        do {
//            System.out.print("Enter number grade: ");
//            int userGrade = grade.nextInt();
//            if (userGrade < 60) {
//                System.out.println("F");
//            } else if (userGrade < 67) {
//                System.out.println("D");
//            } else if (userGrade < 80) {
//                System.out.println("C");
//            } else if (userGrade < 90) {
//                System.out.println("B");
//            } else {
//                System.out.println("A");
//            }
//            System.out.print("Do you want to continue: [Y/N]");
//            confirm = grade.next().equalsIgnoreCase(("y"));
//        } while (confirm);


    }
}
