import java.util.*;

public class AccountTest {

    public static void main(String[] args){
        Meat chicken = new Meat("Chicken",284,53.4,6.2, 1,0.7,18.4);
        Vegetable carrot = new Vegetable("Carrot",41,0.6,.2,107,12,4);
        //Meat beef = new Meat("Beef",300,40.4,10.2, .5,1,12.4);
        Meat cHiCkEn = new Meat("McDonalds 'Chicken'",1000,12,23.2, .5,0.2,3.4);


        Person p1 = new Person("Keith","Scannell","Cork",chicken);
        Person p2 = new Person("Not-Keith","Not-Scannell","Not-Cork",carrot);
        Person p3 = new Person("David","Davidson","Dublin",cHiCkEn);

        //System.out.println("Person class test");
        //System.out.println(p);
        //Person p1 = new Person();
        //p.display();

        //System.out.println("\n");
        System.out.println("Part 12:");
        BankAccount b = new BankAccount(p1,420,999999999);
        System.out.println("Bank account class test");
        b.display();
        //
        //System.out.println(b);
        //b.display();

        System.out.println("\n");
        LoanAccount l = new LoanAccount(p1,420, 999999999 ,17);
        System.out.println("Loan account class test");
        l.display();
        /*
        System.out.println(l);
        System.out.println("Display loan account ");
        l.display();*/
        /*13. Additionally, print only account holder’s first name and also the balance of the BankAccount object.*/
        System.out.println("\n");

        System.out.println("Part 13:\n"+b.getPerson().getFirstName()+"\n"+b.getBalance());

        System.out.println("\nPart 14:");
        //System.out.println("Before increase:"+l.getOverDraftLimit());
        l.setOverDraftLimit(l.getOverDraftLimit()+200);
        System.out.println(l.getAccNum()+"\n"+l.getPerson().getLastName()+"\n"+l.getOverDraftLimit() );


        /*Vegetable v = new Vegetable("Carrot",41,0.6,.2,107,12,4);
        Meat m = new Meat("Chicken",284,53.4,6.2, 1,0.7,18.4);
        v.display();
        System.out.println(v.healthy());
        m.display();
        System.out.println(m.healthy());*/
        //System.out.println(v);
        //System.out.println("\n"+p.getFavouriteFood().getName());
        System.out.println("\nPart 2:");
        p1.display();
        System.out.println("Meat object:");
        System.out.println(chicken);
        System.out.println("Display:");
        chicken.display();
        System.out.println("\n");



        HashSet<Person> people = new HashSet<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        for(Person p: people){
            p.display();
            if(p.getFavouriteFoodM() instanceof Meat){
                System.out.println("Favourite food:");
                p.getFavouriteFoodM().display();
                System.out.println("Is favourite food healthy?");
                System.out.println(p.getFavouriteFoodM().healthy());
                System.out.print("\n");
            }
            else{
                System.out.println("Favourite food:");
                p.getFavouriteFoodV().display();
                System.out.println("Is favourite food healthy?");
                System.out.println(p.getFavouriteFoodV().healthy());
                System.out.print("\n");

            }
        }


    }
}