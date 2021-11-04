package Interfaces_Abstract_lecture;

import java.sql.SQLOutput;

public class Company {

    public static void main(String[] args) {
        Accountant accounting = new Accountant("Account-Man", "Accounting");
        Custodian cleanerBot = new Custodian("CleanserBot9001", "Maintenance");
        //polymorphing would look like below - and it would work the same as above.
//        Employee accounting = new Accountant("Account-Man", "Accounting");
//        Employee cleanerBot = new Custodian("cleanerBot9001", "Maintenance");


        System.out.println(accounting.work());
        System.out.println(accounting.getName());
        System.out.println(accounting.getDepartment());

        System.out.println(cleanerBot.work());
        System.out.println(cleanerBot.getName());
        System.out.println(cleanerBot.getDepartment());

        System.out.println(accounting.getName() + " is reporting for business for the " + accounting.getDepartment() +" department");
        System.out.println(cleanerBot.getName() + " is reporting for business for the " + cleanerBot.getDepartment() +" department");

        System.out.println("Whats up with their morning meeting?");
        System.out.println("Account-Man morning: " + accounting.morningMeeting());
        System.out.println("CleanserBots morning: " + cleanerBot.morningMeeting());

        System.out.println("Whats up with their lunch?");
        System.out.println("Account-Man lunch: " +accounting.lunchTime());
        System.out.println("CleanserBots lunch: " +cleanerBot.lunchTime());

        System.out.println("How much do they get paid?");
        System.out.println("Account-Man.dailyPay: " +accounting.dailyPay());
        System.out.println("CleanserBots.dailyPay: " +cleanerBot.dailyPay());
    }
}
