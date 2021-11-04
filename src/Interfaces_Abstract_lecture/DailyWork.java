package Interfaces_Abstract_lecture;

public interface DailyWork {
    String work();
    String morningMeeting();
    String lunchTime();

    int dailyPay();


    //this is loosely coupled because these are in their own file without other things like in the Employee class
    //implementing multiple interfaces = class Multiples implements Interface1, Interface2; but this will require two contracts which should be like on this Class and how we added these classes in Custodian and Accountant
    //interface has all the methods, superclasses have constructors, but abstract stuff might not have constructors (i think)
}
