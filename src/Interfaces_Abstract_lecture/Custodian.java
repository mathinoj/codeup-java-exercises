package Interfaces_Abstract_lecture;

public class Custodian extends Employee{
//fullfill contract
    public Custodian(String name, String department){
        super(name, department);
    }


//fullfill contract - I think at first the public class Custodian will be red, but after this it wont be
public String work(){
    return "Maintaining the building - cleaning up messes - restocking!";
}

    //you added th morningMeeting, lunchTime, and dailyPay by using intelliJ smart highlight
    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance dept.";
    }


    public String lunchTime() {
        return "12-1pm";
    }

//    @Override// remove this
    public int dailyPay() {
        return 20;
    }


}
