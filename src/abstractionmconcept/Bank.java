package abstractionmconcept;

public abstract class Bank {

    //Naveen video

    int amt = 100;
    final int rate = 10;
    static int loatrate = 50;


    //partial abstraction
    //hiding the implementation logic ---is called Abstraction
    //can not create object of Abstract class

    public abstract void loan();



    //non abstract method
    public void credit(){

        System.out.println("Bank ---Credit");
    }

    public void debit(){

        System.out.println("Bank ---Debit");
    }
}
