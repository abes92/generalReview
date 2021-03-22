package CollectionList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {// belong to list interface
    //if faster then arraylist if you wanna assign values
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("abes");
        ll.add("hamza");
        ll.add("sedik");
        ll.add("djilali");
        ll.add(1,"amar");
        System.out.println("printing the linklist values"+ll);
        ll.remove(3);
        ll.addFirst("ahmed");
        ll.addLast("mahdi");
        System.out.println("printing the linklist values"+ll);
        //for loop
        System.out.println("*******using for loop");
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        //for each
        System.out.println("*******using for each loop");
        for (String str:ll) {
            System.out.println(str);
        }
        //iterator
        System.out.println("*******using iterator");
        Iterator<String> it=ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //while
        System.out.println("*******using while");
        int num=0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }

    }
}
