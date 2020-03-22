package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println(number.size());

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);

        Iterator iterator = number.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //System.out.println(number);
        //for (int i = 0; i < number.size(); i++) {

        // System.out.println(number.get(i));

        //System.out.println(number.size());

        //number.remove(2);
        //System.out.println(number);

        //number.clear();
        // System.out.println(number);

        //boolean check = number.isEmpty();
        //System.out.println("arraylist empty "+check);

        //boolean pos =  number.contains(30);
        //System.out.println("arraylist contains "+pos);

        //int pos = number.indexOf(40);
        //System.out.println("The indiex of 40 is "+pos);

        //number.set(3,50);  Replace
        //System.out.println(number);

    }

}