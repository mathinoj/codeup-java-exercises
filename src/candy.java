import java.util.Scanner;

public class candy {
//    public static void main(String[] arg){
     public String name;
     public String size;

     public candy(String name){ //todo STEP 1
//          name = candyName;
//          size = "unknown";
          this.name = name;
          this.size = "unknown";
     } //todo STEP 1

     public void talkAboutCandy(){
          System.out.printf("Ahhh, a %s! I see that you got the %s of it. Sounds good! :) %n ", this.name, this.size);
     }

     public candy(String name, String size){ // todo STEP 2
          this.name = name; // todo ALL this is OVERLOADING, and is second constructor
          this.size = size; // todo STEP 2
     }

     public static void main(String[] args) { //todo STEP 2 as a test

          candy unknownCandy = new candy("dat candy");

          System.out.println("unknownCandy.name = " + unknownCandy.name);
          System.out.println("unknownCandy.size = " + unknownCandy.size); //todo STEP 2 as a test
          unknownCandy.talkAboutCandy();

          candy funSnickers = new candy("Snickers", "fun-size");
          System.out.println("funSnickers = " + funSnickers.name);
          System.out.println("funSnickers = " + funSnickers.size);
          funSnickers.talkAboutCandy();


     }

//     public candy(String candyName, String candyNameSize){
//          name = candyName;
//          size = candyNameSize;
//     }
//
//     public String getStuff(){
//          return String.format("name: %s, size: %s", name, size);
//     }
//
//     public static void main(String[] args){
//          candy c1 = new candy("Candy A");
//          candy c2 = new candy("Candy B", "Payday");
//          System.out.println(c1.getStuff());
//          System.out.println(c2.getStuff());
//     }



//Write a public class named ‘Candy’ - this class should have two public fields, both taking in a string literal as a value.
//The first would be ‘name’ and the second will be ‘size’.
//The class will also need two constructors - the first for if we know the name, but not the size. Your first constructor should set some kind of string literal for the size.
//The second would be for if we know both the name and the size. This second constructor will pass through those arguments into the Candy object being instantiated.
//BONUS:
//Write a method for your Candy class - this method should print out a message saying:
//“Ahhh, a [name]! I see that you got the [size] of it. Sounds good! :)”

//    }
}
