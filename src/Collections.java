import java.util.ArrayList;
import java.util.HashMap;
//import java.util.*; THIS TELLS JAVA TO IMPORT EVERYTHING, BUT IT MIGHT NOT BE THE BEST THIGN TO DO

public class Collections {

    public static void main(String [] args){
//        String[] nameOfVar = {"thing1", "thing2", "thing3" };
//        System.out.println(nameOfVar[3]); **************OLD WAY: Array initializer, not as easy to work with

//        ArrayList<String> nameOfVar = new ArrayList<>();


        ArrayList<String> students = new ArrayList<>();

        students.add("mcKenneth");
        students.add("mcCody");

        System.out.println("students.size() = " +students.size());
        System.out.println(students); //what you didn't have to do is the 'array.toString'\\

        ArrayList<Integer> myFavoriteNums = new ArrayList<>();
        myFavoriteNums.add(13); //this and three lines down is called METHOD OVERLOADING
        myFavoriteNums.add(222);
        myFavoriteNums.add(0, 7);
        myFavoriteNums.add(1, 42);// if you wanted to move element to the end or ArrayList you'd do (index: 3, element: 42)
        myFavoriteNums.add(2, 21);

        System.out.println(myFavoriteNums); //all this shows that it will send to/as strings
        System.out.println("myFavoriteNums " + myFavoriteNums.size());

        System.out.println("myFavoriteNums.indexOf(222) = " + myFavoriteNums.indexOf(222));
        System.out.println("myFavoriteNums.get(2) = " + myFavoriteNums.get(2));

        System.out.println("myFavoriteNums.contains(42) = " + myFavoriteNums.contains(42));

        System.out.println(myFavoriteNums);
        System.out.println("myFavoriteNums.lastIndexOf(21) = " + myFavoriteNums.lastIndexOf(21));
        System.out.println("myFavoriteNums.IndexOf(21) = " + myFavoriteNums.indexOf(21));

//        System.out.println("myFavoriteNums.isEmpty() = " + myFavoriteNums.isEmpty());

        System.out.println();
        myFavoriteNums.remove((Integer) 21);// to remove you must do it like this.
//        myFavoriteNums.remove(5); DOING THIS WOULD REMOVE THE SECOND 21 THAT ISN'T THERE RIGHT NOW
        System.out.println(myFavoriteNums);

//        ArrayList<Integer> removalList = new ArrayList<>();
//        removalList.add(21);
//        myFavoriteNums.removeAll(removalList);
//        System.out.println(myFavoriteNums); THESE FOUR THINGS WOULD REMOVE MULTIPLE 21s
        //if you wanted to remove additional numbers you would do removalList.add(NUMBER YOU WANT REMOVED) below removalList.add(21);

        System.out.println("~~~~~~~~~~~~~~~~~~~Hash Maps ~~~~~~~~~~~~~~~~~~~\n");

//        HashMap<keyDataType, valueDataType> nameVar = new HashMap<>();

        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("Kenneth", "ken2cool"); //kenneth = keyDataType  ken2cool = valueDataType
        usernames.put("Shanshan", "theGOAT");
        usernames.put("Cody", "codynotTheDuck"); // this setup is called a key-value pair. First part is KEY, second part is VALUE

        System.out.println("usernames.get(\"Shanshan\") = " + usernames.get("Shanshan"));
        System.out.println("usernames.get(\"Alex\") = " + usernames.get("Alex")); //this will get a null
//        System.out.println("usernames.get(\"Shanshan\") = " + usernames.get("Shanshan"));
        System.out.println("usernames.get(\"theGOAT\") = " + usernames.get("theGOAT"));
        System.out.println("usernames.get(\"aGOAT\") = " + usernames.get("aGOAT"));

        System.out.println("usernames.getOrDefault(\"Alex\", \"noUserFound\") = " + usernames.getOrDefault("Alex", "noUserFound"));

        System.out.println(usernames);

        usernames.putIfAbsent("Shanshan", "shashan210");
        usernames.putIfAbsent("Alex", "majinAlex");
        System.out.println(usernames);

        System.out.println();
        System.out.println(usernames);
        usernames.remove("Alex");
        System.out.println(usernames);

        System.out.println();
        System.out.println(usernames);
        usernames.replace("Shanshan", "shanshan210");
        System.out.println(usernames);

        System.out.println();
        System.out.println(usernames);
        usernames.clear();
        System.out.println(usernames);
        System.out.println("usernames.isEmpty() = " + usernames.isEmpty());

    }
}
