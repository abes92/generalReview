package C0llectionSet;

import java.util.TreeSet;

public class TreeSetConcept {
    public static void main(String[] args) {
        TreeSet<Character> ts=new TreeSet<>();
        ts.add('d');//0
        ts.add('a');//1
        ts.add('e');//2
        ts.add('b');//3
        ts.add('c');//4
        ts.add('f');//5
        ts.add('j');//6
        for(Character cr:ts){
            System.out.println(cr);
        }
        System.out.println("*********************");
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println("*********************");
        TreeSet<Integer> t=new TreeSet<>();
        t.add(4);
        t.add(2);
        t.add(3);
        t.add(1);
        t.add(5);
        for(Integer te:t){
            System.out.println(te);
        }
    }
}
