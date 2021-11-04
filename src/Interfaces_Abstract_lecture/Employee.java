package Interfaces_Abstract_lecture;


abstract class Employee implements DailyWork {
    // you originally had 'public class Employee', but then changed it to 'abstract class Employee'
    //benefit of using protected allows us to still share with super and subclasses but locks down visibility specific to those. Only sublcasses can use this
    protected String name;
    protected String department;

    //constructor
    public Employee (String name, String department){
        this.name = name;
        //if you take out 'this.' functionality is same but readability isn't
        //this. shows that objects name will be assigned to the parameter of 'name'
        this.department = department;
    }

    //getters/setters
    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }


//    public String work(); //this wont work cuz there's no method body, to fix this you do below
//    public abstract String work(); this is tightly coupled




//    public static void main(String[] args) {
//        Employee mcken = new Employee("Ken", "web dev");
//    }
}
