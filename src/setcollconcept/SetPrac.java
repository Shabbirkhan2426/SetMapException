package setcollconcept;

import java.util.ArrayList;
import java.util.HashSet;

public class SetPrac {

    public static void main(String[] args) {

        setPractice();


    }
    public static void setPractice(){

        ArrayList namelist = new ArrayList();
        HashSet nameSet = new HashSet();

        namelist.add("Shabbir");
        namelist.add("Shabbir");
        namelist.add("Shabbir");
        namelist.add("Mashuk");
        namelist.add("Shabbir");

        nameSet.add("Shabbir");
        nameSet.add("Shabbir");
        nameSet.add("Shabbir");
        namelist.add("Mashuk");
        namelist.add("Shabbir");

        System.out.println("Name List:  "+namelist);
        System.out.println(" Name Set: "+nameSet);
    }
}
