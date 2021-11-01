import java.util.Arrays;

public class ArraysExercises {

    public static void addPerson(Person[] people, Person newPerson){
        System.out.println(newPerson.getName());
        System.out.println(people[0].getName());

        System.out.println("people.length = " + people.length);
        Person[] nameplusone = Arrays.copyOf(people, people.length + 1);

        System.out.println("nameplusone.length = " + nameplusone.length);

        nameplusone[nameplusone.length-1] = newPerson;
        for(Person nombre : nameplusone){
            System.out.println(nombre.getName());
        }
    }

    public static void main(String[] arg) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        //when you run this it gives out the reference memory of the numbers, therefore you need to convert it to a string!
//        System.out.println(Arrays.toString(numbers)); // this will convert it to an array of numbers

        Person[] people = {new Person("Matt"), new Person("Dave"), new Person("Ned")};
        Person newPerson = new Person("Don");

        addPerson(people, newPerson);


//        System.out.println(people);
        System.out.println(people.length);
//        System.out.println(Arrays.toString(people));

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
            //        System.out.println(Arrays.toString(people));
        }
//        for (Person person : people) { //todo THIS IS THE ENHANCED FOR LOOP
//            System.out.println(person);
//        } //todo THIS IS THE ENHANCED FOR LOOP

    }
}
