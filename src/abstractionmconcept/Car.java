package abstractionmconcept;

public interface Car {

    //only final and static variable
    final int wheels = 4;

    //Alwasys define only the abstract method
    //no mehtod body
    //only mehtod declaration
    //we achieve 100% abstaction
    //can not create object of interface


    public void start();
    public void stop();
    public void refuel();
}
