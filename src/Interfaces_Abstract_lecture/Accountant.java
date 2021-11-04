package Interfaces_Abstract_lecture;

public class Accountant extends Employee {
    public Accountant(String name, String department) {
        super(name, department);
    }


        public String work(){
        return "Doing accounting type stuff.";
    }

    //these are pulled from the dailyWork class
    public String morningMeeting() {
        return "Morning meeting start at 815am";
    }


    public String lunchTime() {
        return "Accountants eat lunch at their desk";
    }

    public int dailyPay() {
        return 500;
    }
}
