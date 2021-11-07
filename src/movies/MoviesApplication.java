package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

import static movies.MoviesArray.findAll;

//import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("");
        System.out.println("Enter your choice:");

        Input in = new Input(); //Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
        String userChoice = in.getString(); //this is pulled from the 'Input' class, which references the 'getString' method from that class. It returns the next line of the scanner; the scanner is the property of the 'input'.

        //based of the user input we have to create some conditional outcomes
        if (userChoice.equals("0")) {
            System.out.println("Laterz Alligatorz");
        } else if (userChoice.equals("1")) {
            Movie[] movieList = findAll(); //THIS grabs from the 'MovieArray.java' and assigns it to a variable. 'findAll' was immediately available so we had to import it. 'findAll' returns the MoviesArray of all the movies. We store it in a variable for the first option "1".
            for (Movie allMovie : movieList) {
                System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
            }
            repeat();
        } else if (userChoice.equals("2")) {
            Movie[] movieList = findAll();
            for (Movie allMovie : movieList) { //we bring this for loop so we can first cycle through each movie in the list
                if (allMovie.getCategory().equals("animated")) {
                    System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();

        } else if (userChoice.equals("3")) {
            Movie[] movieList = findAll();
            for (Movie allMovie : movieList) {
                if (allMovie.getCategory().equals("drama")) {
                    System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userChoice.equals("4")) {
            Movie[] movieList = findAll();
            for (Movie allMovie : movieList) {
                if (allMovie.getCategory().equals("horror")) {
                    System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userChoice.equals("5")) {
            Movie[] movieList = findAll();
            for (Movie allMovie : movieList) {
                if (allMovie.getCategory().equals("scifi")) {
                    System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        }
    }


    //TODO method that allows user to repeat the program to ask if they want more movies
    private static void repeat() { //since we already inside program we don't need to 'welcome' or ask 'what they want to do'
        System.out.println("----------------");
        System.out.println("Navigation");
        System.out.println("0 - Exit, 1 - All Movies, 2 - Animated Movies, 3 - Drama Movies, 4 - Horror Movies, 5 - SciFi Movies");


        System.out.println("Enter your choice: ");
        Input in = new Input();
        String userChoice = in.getString();

        if (userChoice.equals("0")) {
            System.out.println("Laterz Alligatorz");
        } else if (userChoice.equals("1")) {
            Movie[] movieList = findAll();
            for (Movie allMovie : movieList) {
                System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
            }
            repeat();
        } else if (userChoice.equals("2")) {
            Movie[] movieList = findAll();
            for (Movie allMovie : movieList) {
                if (allMovie.getCategory().equals("animated")) {
                    System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();

        } else if (userChoice.equals("3")) {
            Movie[] movieList = findAll();
            for (Movie allMovie : movieList) {
                if (allMovie.getCategory().equals("drama")) {
                    System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userChoice.equals("4")) {
            Movie[] movieList = findAll();
            for (Movie allMovie : movieList) {
                if (allMovie.getCategory().equals("horror")) {
                    System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userChoice.equals("5")) {
            Movie[] movieList = findAll();
            for (Movie allMovie : movieList) {
                if (allMovie.getCategory().equals("scifi")) {
                    System.out.println(allMovie.getName() + " -- " + allMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        }
    }
}


