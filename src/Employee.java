public class Employee extends Person { //make sure to FIRST look at note in PERSON class, you need to do that FIRST****************

    public Employee(String employeeName){
        super(employeeName); //step 3
        //calling the constructor method from Person - Person(employeeName)
    }

    public int getAge(){ //step 7
        return this.age;
    }

    public void sayHello(){ //step 5, the original sayHello on Person brings out "Hello, there Ken", but this method overrides that!
        System.out.println("Welcome to MegaCorp - how may I help you?");
//        System.out.println("Welcome to MegaCorp - how may I help you? My name is " + this.getName()); *****HOW TO ADD NAME, like this*******
    }

    public void doWork(){ //step 6
        System.out.println("Work, work ...");
    }


//////////////////////////////////////////SEPARATOR FROM METHODS ABOVE//////////////////////////////////////////////////
    public static void main(String[] args){ //step 1

        Person unemployedKen = new Person("Kenni");//Example 1: this gets their own method, so what we are seeing is the original sayHello
        System.out.println("unemployedKen.getName() = " + unemployedKen.getName()); //Ex 1
        unemployedKen.sayHello(); //Ex 1
        System.out.println();//Example 1 and above three lines *****ALSO THIS ONE JUST BASICALLY ADDS SPACE IN CONSOLE FROM THE ONE BELOW

        Employee ken = new Employee("Ken"); //step 2
        ken.sayHello(); //step 4
        System.out.println("ken.name = " + ken.getName());//step 4

        ken.doWork(); //step 6
//        unemployedKen.doWork(); this doesn't work cuz of inheritance of subclasses
    }

}
