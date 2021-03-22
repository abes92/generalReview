package MapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapConcept {
    public static void main(String[] args) {
        HashMap<Integer,String> hp=new HashMap<>();
        hp.put(4,"abes");
        hp.put(3,"sedik");
        hp.put(6,"hamza");
        hp.put(8,"djamel");
        hp.put(2,"idir");
        hp.put(1,"idir.m");
        hp.put(0,"ahmed");
        hp.remove(0,"ahmed");
        hp.put(7,"ahmed");
        for(HashMap.Entry s:hp.entrySet()){
            System.out.println(s.getKey()+" "+s.getValue());
        }
        System.out.println("******************");
       Set set=hp.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("******************");
        System.out.println(hp.entrySet());
        System.out.println("******************");
        HashMap<String,String> Map1=new HashMap<>();
        Map1.put("e","abes");
        Map1.put("d","sedik");
        Map1.put("a","hamza");
        Map1.put("c","djamel");
        Map1.put("b","idir");

        for (Map.Entry hmp:Map1.entrySet()) {
            System.out.println(hmp.getKey()+" "+hmp.getValue());
        }
        System.out.println("******************");
//        Set st=Map1.entrySet();
        Iterator<String> itt=Map1.keySet().iterator();
        while (itt.hasNext()){
            String key=itt.next();
            String value=Map1.get(key);
            System.out.println("key = "+key+"\tvalue = "+value);
        }
        System.out.println("******************");
       Iterator<Map.Entry<String,String>> it1=Map1.entrySet().iterator();
       while (it1.hasNext()){
          Map.Entry<String,String> entry=it1.next();
          System.out.println("key= "+entry.getKey()+" value= "+entry.getValue());
       }
        System.out.println("******************");
       // iterating hashmap using jdk 8/foreach /lambda
        Map1.forEach((k,v) -> System.out.println("key = "+k+" value = "+v));
    }
}
