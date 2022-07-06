
import java.util.ArrayList;
import java.util.Collections;

public class ALUsingCollectionFramework {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2  = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add element ------------
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(9);

        System.out.println(list);


        //get element-------------
        int element =list.get(0);

        System.out.println(element);


        //add a element in between two -----------------
        list.add(1, 3);            /** here first is index number and secont is element */

        System.out.println(list);


        //set element or change element--------------------
        list.set(0, 2);

        System.out.println(list);


        //delete element-------------------
        list.remove(4);
        list.remove(2);

        System.out.println(list);


        //to count or know size of arrayList-----------------------
        System.out.println(list.size());


        //loops---------------------
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i));
        }


        //sorting---------------------------
        Collections.sort(list);                 /**We can sort ArrayList uaing "Colections.sort" key-word , also we have to imprt "Collections" package*/
        System.out.println(list);

    }
}
