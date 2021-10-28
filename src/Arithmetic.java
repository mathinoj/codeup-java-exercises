public class Arithmetic {
    //Static fields
    // a static property:
    public static double pi = 3.14159;


    //Static methods:
    public static int add(int x, int y){
        return x + y;
    };

    //static does not have a unique instance. Ex 'math' it is not unique cuz math is universal, which means that static is always gonna be the same
    //Static is accessible without creating an instance of the class.
    //Static should contain information that all instances will use, or methods and properties that are meant to be accessed only statically
    //Static properties can be referenced by instance methods. But instance properties cannot be referenced in a static context.
    //You cannot access an instance variable in a static context (only individual people have names, not people in general).


    public static void main(String[] args){
        //*********************DO NOT DO THIS**********************
        //Arithmetic myMath = new Arithmetic();
        //System.out.println(myMath.pi); //this would work but its INCORRECT

        System.out.println("Arithmetic.pi =" + Arithmetic.pi);

        System.out.println("Arithmetic.add(2, 2) = " + Arithmetic.add(2, 2));



    }

}
