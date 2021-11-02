public class PolymorphismDemo {
//    my application [polymorphismDemo] has method calling on employee.work()
    public static void doWork(Worker w){ //we need 'Worker w' in this method to (dowork steps into object and calls that object)
        System.out.println(w.work()); //STATIC was added. after he added doWork(one/two) he added Static cuz it was yelling I think
    }

    public static void main(String[] args){
        Worker one = new Worker();
        Worker two = new Manager();

        doWork(one);
        doWork(two);

    }
}
//without static dowork is expecting instantiation(an instance) of an object

//An object and an instance are the same thing.

//Personally I prefer to use the word "instance" when referring to a specific object of a specific type, for example "an instance of type Foo". But when talking about objects in general I would say "objects" rather than "instances".

//A reference either refers to a specific object or else it can be a null reference.

//They say that they have to create an instance to their application. What does it mean?

//They probably mean you have to write something like this: Foo foo = new Foo();

//if you create a class that supposed to create many objects for itself (candy, worker, etc) you DONT use STATIC
//for classes that are gonna be used in conjunction with other classes then you can USE STATIC
