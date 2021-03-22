package C0llectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("1 allah\t");
        hs.add("2 forgive ");
        hs.add(" 3 me ");
        hs.add("4 i am ");
        hs.add(" 5 a sinner ");

        for (String st: hs) {
            System.out.println(st);

        }
        System.out.println("***********************");
        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            String a=it.next();
            System.out.print(a);
        }
        System.out.println("***********************");
        Books b1=new Books(102,"abes","sedik","hamza",1000);
        Books b2=new Books(101,"gana","salah","mahmoud",100);
        Books b3=new Books(100,"achour","krimo","idir",1000);
        Books b4=new Books(103,"karim","mustafa","lyly",200);
        HashSet<Books> hs1=new HashSet<>();
        hs1.add(b1);
        hs1.add(b2);
        hs1.add(b3);
        hs1.add(b3);
        hs1.add(b4);
//        Iterator ite=hs1.iterator();
//        while(ite.hasNext()){
//            System.out.println(ite.next());
//        }
        for (Books b:hs1) {
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

        }



    }

}
