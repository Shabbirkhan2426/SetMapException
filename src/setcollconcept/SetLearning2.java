package setcollconcept;

import java.util.HashSet;
import java.util.Iterator;

public class SetLearning2 {
    public static void main(String[] args) {

        //How to Print a value such as NOT but it will print EAST because of iterator hasNext mehtod for line 16-28

       // setcollection();

        //setstudy();

        //setjava();


    }

    /*public static void setcollection(){

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Learning");
        set.add("Not");
        set.add("Easy");
        set.add("Without Practice");

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            if(itr.next().equals("Not")){
                System.out.println(itr.next());
            }
        }*/

    //IF you want to print a specific value, then value example

    /*public static void setstudy(){

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Learning");
        set.add("Not");
        set.add("Easy");
        set.add("Without Practice");

        Iterator <String>itr = set.iterator();
        while (itr.hasNext()){
            String var = itr.next();
            if(var.equals("Without Practice")){
                System.out.println(var);
            }
        }


       }*/

     //When you want print all the values
       public static void setjava(){

        HashSet set1 = new HashSet<>();
        set1.add("Biplop Bhai");
        set1.add("Going to Work year of");
        set1.add(10);
        set1.add("in IT");

        Iterator itr = set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


       }
    }


