package setcollconcept;

import java.util.HashSet;
import java.util.Iterator;

public class SetLearning {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("Shabbir");
        set.add("way2Learning");
        set.add("Selinium");
        set.add("Api");
        set.add("Shabbir");

        //System.out.println(set);

        //Udemy

        //Iterator itr = set.iterator();//question on line 19 this is like formula or what?
        //while(itr.hasNext()){
        //    System.out.println(itr.next());
        //}

        //If I want to print Selnium below example to use
        //QUESTION ON HOW TO FETCH THE VALUE FOR EXAMPLE API
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            if(itr.next().equals("Api")){
                System.out.println(itr.next());

            }
        }

    }
}
