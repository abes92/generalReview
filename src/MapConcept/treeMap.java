package MapConcept;

import java.util.Set;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        // we use treMap when we want to print or use something based on sort keys
        TreeMap<String,String> tmp=new TreeMap<>();
        tmp.put("Abes","Taieb");
        tmp.put("sedik","Taieb");
        tmp.put("hamza","Taieb");
        tmp.put("hacen","ferhat");
        tmp.put("amar","rezaoui");
        tmp.put("iddir","tayeb");
        System.out.println(tmp.size());
        System.out.println(tmp);
        tmp.forEach((k,v)->System.out.println(k+" "+v));
        System.out.println(tmp.lastKey());
        System.out.println(tmp.firstKey());
          Set<String> keyLessThen= tmp.headMap("hamza").keySet();
          System.out.println(keyLessThen);
            Set<String>  key=tmp.tailMap("hamza").keySet();
            System.out.println(key);

        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(36,"Taieb");
        map.put(97,"Taieb");
        map.put(45,"Taieb");
        map.put(98,"ferhat");
        map.forEach((k,v)->System.out.println(k+"="+v));




//        for (int i=0;i<tmp.size();i++){
//            System.out.println(tmp.get(i)+" ");
//        }

    }
}
