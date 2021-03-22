package MapConcept;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {
    public static void main(String[] args) {
        Map<Integer,String> tm=new TreeMap<>();
        tm.put(5,"ahmed");
        tm.put(2,"hachemi");
        tm.put(4,"mohand");
        tm.put(3,"belkacem");
        tm.put(1,"cherif");
        tm.put(6,"abdelah");
        tm.remove(1,"cherif");
        tm.remove(2,"hachemi");
        for(Map.Entry ent:tm.entrySet()){
            System.out.println(ent.getKey()+" "+ent.getValue());
        }
        System.out.println("*******************************");
        Set re=tm.entrySet();
        Iterator it=re.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("*******************************");
        System.out.println(tm.entrySet());

    }
}
