import java.util.Arrays;

public class ArrayLecture {


    public static void main(String[] args) {
        double[] prices = new double[4];
        final int numberOfSides = 6; // constant with a numeric literal of 6

        int[] diceSides = new int[numberOfSides];

        System.out.println("prices.length = " + prices.length);
        System.out.println("diceSides.length = " + diceSides.length); //this doesn't work if we take out the array length

        //System.out.println("diceSides[0] = " + diceSides[0]);// if nothing is set inside a value you will get a DEFAULT VALUE of 0
        //System.out.println("diceSides[0] = " + diceSides[12]);//this wont work because we are out of bounds from the initializer of 6 we set
        System.out.println("diceSides[0] = " + diceSides[5]);

        String[] mybag = {"Snickers", "Reese's", "Brussels"};

        System.out.println("mybag.length = " + mybag.length);
//        System.out.println("mybag[1] = " + mybag[1]);

//        for(int i = 0; i < mybag.length; i++){
//            System.out.println(mybag[i]);
//
//        }

        for(String couldBeNamedAnything : mybag) { // enhanced for loop
//            System.out.println(candy); //todo this is like a test
            System.out.printf("%s is the piece of candy you just pulled out of the bag. %n", couldBeNamedAnything);
        }

            String[] anotherbag = new String[12];
            System.out.println("anotherbag[0] = "+ anotherbag[0]);
            System.out.println("anotherbag[5] = "+ anotherbag[5]);

//            Arrays.fill(anotherbag, "snickers");
            Arrays.fill(anotherbag, "reese's");


            for(String candy : anotherbag){
                System.out.println(candy);
            }

            System.out.println();



        System.out.println("Arrays.equals(anotherbag, anotherbag) = " + Arrays.equals(anotherbag, anotherbag));
        System.out.println("Arrays.equals(mybag, anotherbag) = " + Arrays.equals(mybag, anotherbag));

//        String[] mybagplustwo = Arrays.copyOf(mybag, 5);
//        String[] mybagplustwo = Arrays.copyOf(mybag, mybag.length + 1);
//        String[] mybagplustwo = Arrays.copyOf(mybag, mybag.length);
        String[] mybagplusone = Arrays.copyOf(mybag, mybag.length + 1);


        System.out.println("mybag.length = " + mybag.length);
//        System.out.println("mybagplustwo.length = " + mybagplustwo.length);
        System.out.println("mybagplusone.length = " + mybagplusone.length);

        mybagplusone[mybagplusone.length-1] = "skittles"; //this goes to the last element of the array minus 1, without this it would show null as the 4th
        for(String candy : mybagplusone){
//        for(String candy : mybagplustwo){
            System.out.println(candy);
        }
        System.out.println();

//STRINGIFY ARRAY
        System.out.println(Arrays.toString(mybagplusone));

        Arrays.sort(mybagplusone);
        for (String candy : mybagplusone){
            System.out.println(candy);
        }

//SEARCHING INSIDE OF AN ARRAY
        int skittlesindex = Arrays.binarySearch(mybagplusone, "skittles");
        int snickersindex = Arrays.binarySearch(mybagplusone, "snickers");

        System.out.println("This should be some skittles for Jackie: " +mybagplusone[skittlesindex]);
//        System.out.println("This should be some snickers for myself: " +mybagplusone[snickersindex]);




        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        int[] arrEx = new int[]{1, 2, 3}; //this is an array literal, the second part

        System.out.println("matrix[0] = " +Arrays.toString(matrix[0]));
        System.out.println("matrix[1] = " +Arrays.toString(matrix[1]));
        System.out.println("matrix[2] = " +Arrays.toString(matrix[2]));
//HOW WOULD YOU GET NUMBER 5 TO PRINT??
        System.out.println("matrix[1][1] = " +matrix[1][1]); //THIS is how to get 5
        System.out.println("matrix[2][2] = " +matrix[2][2]); //THIS is how to get 9
        System.out.println("matrix[0][0] = " +matrix[0][0]); //THIS is how to get 1





//        for(int[] row : matrix) { //row is an array of integers
//         System.out.println("+---+---+---+");
//         System.out.print("| ");
//            for (int n : row){
//                System.out.print(n + " | ");
//            }
//            System.out.println();
//        }
//        System.out.println("+---+---+---+");

    }


}
