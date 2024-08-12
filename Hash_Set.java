package Collection;

import java.util.*;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
    //insert data
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    //size of the hashSet
    
    int size = set.size();
        System.out.println("Size of st is "+size);
                    
    //print all elements
        System.out.println(set);
    
    //contains
    if(set.contains(1)){
        System.out.println("Set Conatins 1");
    }
    if(set.contains(9)){
        System.out.println("Set Does not Contains");
    }
    
    //delete
    set.remove(1);
    
    if(!set.contains(1)){
        System.out.println("Does not Contain 1 we deleted it.");
    }
    
    //ITERATOR
    Iterator it = set.iterator();
       // System.out.println("Element "+it.next());
    while (it.hasNext()){
        System.out.println(it.next());
    }    
    }
}
