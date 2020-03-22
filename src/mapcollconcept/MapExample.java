package mapcollconcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {


    public static void main(String[] args) {

        Map <String,String> map = new HashMap <String, String>();
        map.put("firstName","Rahman");
        map.put("lastName","Aman");
        map.put("sub","Selinum");
        map.put("location","United States");
        map.put("firstName","Rahul");

        //QUESTION: IF I WANT TO PRINT TO THE VALES THAT ARE STORED I CAN ALREADY DO THAT BY USING OBJECT IN
        // IN PRINTLINE SO WHY DO I NEED TO DO THAT IN USING ALL FOR LOOP OR ITERATOR

        System.out.println(map);
        //System.out.println(map.size());

        //System.out.println(map.get("firstName"));




    }

}
