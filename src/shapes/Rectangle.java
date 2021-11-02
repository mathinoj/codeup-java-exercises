package shapes;

public class Rectangle {
    protected int length;
    protected int width;

//Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

    public Rectangle (int length, int width){ //pulled this from MethodsExercise class //int is datatype
        this.length = length;
        this.width = width;
        }

    public int getPerimeter (){
       return 2 * length + 2 * width;
//        area = length x width
//        System.out.println("2 * length + 2 * width = " + 2 * length + 2 * width);
    }

    public int getArea(){
        return length * width;
//        System.out.println("length * width = " + length * width);
    }

//    public static void main(String[] args) { COMMENTED OUT BUT LEAVE STUFF BELOW FOR FUTURE NOTES



//        Rectangle perimeter = new Rectangle();
//        System.out.println("perimeter = " + perimeter);
//        perimeter.sayHello();
//        System.out.println();


  //Rectangle perimeterA = new Rectangle(5, 5); COMMENTED OUT BUT LEAVE STUFF ABOVE /BELOW FOR FUTURE NOTES
//  Rectangle areaA = new Rectangle();

        //     //STEP 3 11/2
        //          Candy funsizeSnickers = new Candy("Snicekrs", "fun-size", new String[] {"treenut allergy", "chocolate-covering", "classic"});
        //          Candy fullsizeKitKat = new Candy("Kit-Kat", "full-size", new String[] {"wafer", "chocolate-covering", "classic"});
        //          System.out.println(Arrays.toString(fullsizeKitKat.descriptors));
        //
        //          //STEP 4 11/2
        //          Candy[] myBag = {funsizeSnickers, fullsizeKitKat};
        //
        //          //STEP 5 11/2
        //          for(Candy singleCandy : myBag){
        //               String descriptors = Arrays.toString(singleCandy.descriptors);
        //               descriptors = descriptors.substring(1, descriptors.length() -1); //SUBSTRING REMOVES BRACKETS
        //               System.out.printf("Here's a %s that is %s - it's described as having the following traits: %s%n", singleCandy.name, singleCandy.size, descriptors);


//    } COMMENTED OUT BUT KEEP STUFF ABOVE FOR FUTURE NOTES



}
