import java.util.HashSet;
import java.util.Iterator;
public class Hashset{
    public static void main(String[] args) {
        //creation   O(1)
        HashSet<Integer> set = new HashSet<>();

        //Insert   O(1)
        set.add(1);
        set.add(2);
        set.add(3);

        //Search    O(1)-- contains
        if(set.contains(1)){
            System.out.println("set contain 1");
        }

        //Delete   O(1)
        set.remove(1);
        if(! set.contains(1)){
            System.out.println("now set does not contain 1");
        }

        //size
        System.out.println("size of set : "+ set.size());

        //Print
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}