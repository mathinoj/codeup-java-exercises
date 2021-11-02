public class SuperHero extends Person{ //1
    private String alterEgo; //for our taxpayer name "clark kent" //2

    public SuperHero(String governmentName, String alterEgo){ //3
        super(governmentName); //3 ---- if you command click super it will take you to the class its pulling from (Person)
        this.alterEgo = alterEgo;
    }
    public String getName(){ //6
        return alterEgo; //6
    }
    public String getSecretIdentity(){ //7
        return super.getName();//7
    }

    public static void main(String[] args){ //4
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");//5
        System.out.println("theManOfSteel.getName() = " + theManOfSteel.getName());//5

        System.out.println("theManOfSteel.getSecretIdentity() = " + theManOfSteel.getSecretIdentity());//8
    }


}
