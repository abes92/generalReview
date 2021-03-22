package C0llectionSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(10);//0
        lhs.add(14);//1
        lhs.add(4);//2
        lhs.add(2);//3
        lhs.add(1);//4
        lhs.add(76);//5
        lhs.add(10);//6
        System.out.println(lhs.size());
        for(Integer i:lhs){
            System.out.println(i);
        }

    }
}
