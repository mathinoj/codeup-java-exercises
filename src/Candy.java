import java.util.Arrays;

public class Candy {
//    public static void main(String[] arg){
     public String name;
     public String size;
     public String[] descriptors; //STEP ONE 11/2*******************

     public Candy(String name){ //todo STEP 1, this is a constructor
          this.name = name; //these are properties
          this.size = "unknown-size";
     } //todo STEP 1

     public void talkAboutCandy(){ // todo BONUS
          System.out.printf("Ahhh, a %s! I see that you got the %s of it. Sounds good! :) %n ", this.name, this.size);
     } // todo BONUS

     public Candy(String name, String size){ // todo STEP 2, this is another constructor
          this.name = name; // todo ALL this is OVERLOADING, and is second constructor
          this.size = size; // todo STEP 2, these are properties
     }

     public Candy(String name, String size, String[] descriptors){ // STEP 2 11/2********************
          this.name = name;
          this.size = size;
          this.descriptors = descriptors;
     }

//     public static void addDescribe (String[] descriptors){
//          System.out.println("descriptors [0] = " +descriptors[0]);
//
//          String[] candies = Arrays.copyOf(descriptors, descriptors.length + 1);
//
//          candies[candies.length-1] = addDescribe;
//          for(String dulce : candies){
//               System.out.println(dulce);
//          }
//
//     }

     public static void main(String[] args) { //todo STEP 2 as a test

//          String[] descriptors = {"candy-coated", "chocolate", "bite-sized", "sour", "gummy"};

//          addDescribe(descriptors);
//
//          for(int i = 0; i < descriptors.length; i++){
//               System.out.println("descriptors[i] = " +descriptors[i]);
//               System.out.println("Your candy is %s and that is just fine.", descriptors);
//          }

//          Candy newCandy = new Candy("candy-coated", "chocolate", "bite-sized", "sour", "gummy");

//          Candy canDesc = new Candy("")

          Candy unknownCandy = new Candy("name brand candy");

          System.out.println("unknownCandy.name = " + unknownCandy.name);
          System.out.println("unknownCandy.size = " + unknownCandy.size); //todo STEP 2 as a test
          unknownCandy.talkAboutCandy(); // todo BONUS

          Candy funSnickers = new Candy("Snickers", "fun-size");
          System.out.println("funSnickers = " + funSnickers.name);
          System.out.println("funSnickers = " + funSnickers.size);
          funSnickers.talkAboutCandy(); // todo BONUS

          //STEP 3 11/2
          Candy funsizeSnickers = new Candy("Snicekrs", "fun-size", new String[] {"treenut allergy", "chocolate-covering", "classic"});
          Candy fullsizeKitKat = new Candy("Kit-Kat", "full-size", new String[] {"wafer", "chocolate-covering", "classic"});
          System.out.println(Arrays.toString(fullsizeKitKat.descriptors));

          //STEP 4 11/2
          Candy[] myBag = {funsizeSnickers, fullsizeKitKat};

          //STEP 5 11/2
          for(Candy singleCandy : myBag){
               String descriptors = Arrays.toString(singleCandy.descriptors);
               descriptors = descriptors.substring(1, descriptors.length() -1); //SUBSTRING REMOVES BRACKETS
               System.out.printf("Here's a %s that is %s - it's described as having the following traits: %s%n", singleCandy.name, singleCandy.size, descriptors);
//               System.out.printf("Here's a %s that is %s - it's described as having the following traits: %s%n", singleCandy.name, singleCandy.size, Arrays.toString(singleCandy.descriptors)); // LIKE THIS WILL LEAVE BRACKETS, and you WOULD COMMENT OUT THE FIRST TWO PARTS************
          }
     }
}
