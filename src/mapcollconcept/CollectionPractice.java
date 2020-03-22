package mapcollconcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionPractice {

    public static void main(String[] args) {

        //mappractice();
        //haspmap1();
        hashmap2();

    }

    /*public static void  mappractice (){

        HashMap<String, Integer> salary = new HashMap();
        //question on this String? is it a Object data type or Primitive data type
        //Qustion on when do use iterator? Iterator can be used in collection

        salary.put("Shabir",100000);
        salary.put("Jahid", 110000);
        salary.put("Mashuk",120000);
        salary.put("Jahid",130000);
        salary.put("Mamun",130000);

        //System.out.println(salary);
        // System.out.println("Salary of Mashuk "+salary.get("Masuk").toString());//Null Pointer Exception applied
        System.out.println("Salary of Employee "+salary.values()); //Pint all the values that are stored
        //System.out.println("Salary of Mashuk "+salary.remove("Jahid"));
        //System.out.println(salary);

    }*/

    /* public static void haspmap1(){

        //  QUESTION ON NUMBER FOR STRING WHY AND HOW

        HashMap<String, String> obj1 = new HashMap<>();
        obj1.put("400","Mukesh");
        obj1.put("601","katalon");
        obj1.put("500","Selenium");
        obj1.put("600","QTP");
        obj1.put("401","GOOD");
        obj1.put("700","Appium");

        System.out.println(obj1);
        System.out.println(obj1.get("700"));

    }*/
    //Question Retrieve the value   Naveen Video

    public static void hashmap2(){

        HashMap <Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1, "Selenium");
        hm.put(2, "QTP");
        hm.put(3, "Katalon");
        hm.put(4,"RFT");

        System.out.println(hm.get(1));
        for(Map.Entry m : hm.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());

        }

        hm.remove(3);
        System.out.println(hm);

    }
}

