import java.util.Locale;

public class StringsHandout {
    public static void main(String[] args){

        // ' ~ " * "strings" * " ~ '
        //Strings can be given a more formal definition - some letters, numbers, and special characters combined (STRUNG together) in some fashion
        //In Java . . THEY ARE NOT PRIMITIVES, THEY ARE OBJECTS - your variables are a reference type instead. That means == asks if both sides have the same reference vs value
        //This leads us to use object comparison methods (.equals and family) to reliably check the VALUES of the objects vs. the REFERENCES of the objects

        //Don't do this! ! ! This is behavior from a woods-y topic related to how the Java Virtual Machine works
        String thisIsAString = "This is a string";
        String thisIsAStringToo = "This is a string";

//        if("This is a string" == "This is a string"){
//            System.out.println("Performing some kind of super important operation with the above!! (Skynet launched!)");
//        }

        //Utilize the methods introduced here instead for consistency and reliability:
        if("This is a string".equals("This is a string")){
            System.out.println("Everything is a-okay over here! We used .equals, so we're feeling confident in what's going on with our code.");
        }

        // ' ~ " * "string comparison methods" * " ~ '

        //Expanding on the thought above: we have a range of string comparison methods! These include a couple we've seen (.equals and its sibling .equalsIgnoreCase), but there are also a couple prefix/suffix focused methods (.startsWith  vs .endsWith)

        //.equals + .equalsIgnoreCase (casematch the total string or ignore the casing of the total string?)
        String txCapitalCity = "Austin";
        String lowercaseTxCapitalCity = "austin";
        System.out.println("txCapitalCity = " + txCapitalCity);
        System.out.println("lowercaseTxCapitalCity = " + lowercaseTxCapitalCity);


        System.out.println("lowercaseTxCapitalCity.equals(lowercaseTxCapitalCity) = " + lowercaseTxCapitalCity.equals(lowercaseTxCapitalCity));
        System.out.println("txCapitalCity.equals(txCapitalCity) = " + txCapitalCity.equals(txCapitalCity));
        System.out.println("txCapitalCity.equals(lowercaseTxCapitalCity) = " + txCapitalCity.equals(lowercaseTxCapitalCity));
        System.out.println("txCapitalCity.equalsIgnoreCase(lowercaseTxCapitalCity) = " + txCapitalCity.equalsIgnoreCase(lowercaseTxCapitalCity));


        //.startsWith
        System.out.println();
        String austinSentence = "The capital city of Texas is " + txCapitalCity + ", and it is growing quickly.";
        System.out.println(austinSentence);
        System.out.println("austinSentence.startsWith(\"The capital city\") = " + austinSentence.startsWith("The capital city"));
//todo starts with method gives a true or false value. The above is true.
        System.out.println("austinSentence.startsWith(\"the capital city\") = " + austinSentence.startsWith("the capital city"));
//todo running the above shows that it is case sensitive and bring out false cuz 'the' should be 'The'
        System.out.println("austinSentence.startsWith(\"The capitol city\") = " + austinSentence.startsWith("The capitol city"));
//todo running the above shows that it is case sensitive and bring out false cuz 'capitol' should be 'capital'

        //.endsWith
        System.out.println("austinSentence.endsWith(\"it is growing quickly.\") = " + austinSentence.endsWith("it is growing quickly."));
//todo, the above is True
        System.out.println("austinSentence.endsWith(\"it is growing QUICKLY.\") = " + austinSentence.endsWith("it is growing QUICKLY."));
//todo, the above is False
        System.out.println("austinSentence.endsWith(\"it is growing quick.\") = " + austinSentence.endsWith("it is growing quick."));
//todo, the above is False

        //' ~ " * "string manipulation methods" * " ~ '

        // .indexOf [search start to finish], .lastIndexOf [start end to finish], .charAt(int index)
        System.out.println();
        System.out.println("austinSentence = " + austinSentence);
        System.out.println("austinSentence.indexOf('x') = " + austinSentence.indexOf('x'));
//todo This will give a numeric value of where the indexOf 'x' was located

        System.out.println("austinSentence.charAt(20) = " + austinSentence.charAt(20));
        System.out.println("austinSentence.charAt(21) = " + austinSentence.charAt(21));
        System.out.println("austinSentence.charAt(22) = " + austinSentence.charAt(22));
        System.out.println("austinSentence.charAt(23) = " + austinSentence.charAt(23));
        System.out.println("austinSentence.charAt(24) = " + austinSentence.charAt(24));
//todo These charAt methods spell out 'Texas'



        System.out.println();
        System.out.println("austinSentence.indexOf(\"capital city\") = " + austinSentence.indexOf("capital city"));
//todo The above would find the indexOf where 'capital city' starts, which in this case is at indexOf(4)
        System.out.println("austinSentence.indexOf(\"capitol city\") = " + austinSentence.indexOf("capitol city"));
// todo Cuz this is misspelled (capitol) the result will be a '-1' which means not found or error

        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("** indexOf goes start to end, lastIndexOf goes end to start: **");
        System.out.println("***************************************************************");


        System.out.println(austinSentence); //todo austinSentense = 'The capital city of Texas is Austin, and it is growing quickly.'
        System.out.println("austinSentence.indexOf(\"is\") = " + austinSentence.indexOf("is"));
//todo The above finds the first 'is' from the START of sentence, which in this case is 26
        System.out.println("austinSentence.lastIndexOf(\"is\") = " + austinSentence.lastIndexOf("is"));
//todo The above finds the first 'is' from the END of sentence, which in this case is 26
        System.out.println();


//todo This below finds character length
        //int length() - returns length of string
        System.out.println("austinSentence = " + austinSentence);
        System.out.println("austinSentence.length() = " + austinSentence.length());
        System.out.println("txCapitalCity = " + txCapitalCity);
        System.out.println("txCapitalCity.length() = " + txCapitalCity.length());
        System.out.println();


        //String .replace(searchPattern, replacementString) - Returns a copy of the string with the matching pattern replaced by the second argument
        String newcapitalSentence = austinSentence.replace("is Austin, and it is", "was five other cities before Austin, and the state is");
        System.out.println("newcapitalSentence = " + newcapitalSentence);


        String newAustinSentence = austinSentence.replace("is Austin, and it is", "was five cities before Austin, and the state is");
        System.out.println(austinSentence);
        System.out.println(newAustinSentence);


        //todo .toLowerCase()
        System.out.println("txCapitalCity = " + txCapitalCity);
        System.out.println("txCapitalCity.toLowerCase() = " + txCapitalCity.toLowerCase());

        //todo toUpperCase()
        System.out.println("txCapitalCity.toUpperCase() = " + txCapitalCity.toUpperCase());

        //,trim() - trim off whitespace on either end of your string
        String paddingAustin = "    austin    ";
        System.out.println("paddingAustin = " + paddingAustin + ".");
        System.out.println("paddingAustin.trim() = " + paddingAustin.trim() + ".");


//todo SUBSTRINGS
        System.out.println("austinSentence.subSTRING(20,25) = " + austinSentence.substring(20, 25));

    }
}
