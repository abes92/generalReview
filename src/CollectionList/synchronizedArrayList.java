package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class synchronizedArrayList {
    public static void main(String[] args) {
      List<String> lt=Collections.synchronizedList(new ArrayList<String>());

      lt.add("abes");
      lt.add("hamza");
      lt.add("sedik");
      //whenever you want to add or remove element you don't need explicit synchronization

        // but to fetch/travers this list you will need explicit synchronization
      synchronized (lt){
        Iterator<String> it=lt.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
      }
//copyOnWriteArrayList: is a class ...thread safe synchronized by default
        CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
      list.add("mahmoud");
      list.add("gana");
      list.add("karim");
      //we dont need explixit synchronization for any operation:add/remove /fetch/travers
      Iterator<String> ite=list.iterator();
      while (ite.hasNext()){
          System.out.println(ite.next());
      }

    }
}
