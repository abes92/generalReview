package MapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class synchronizedMap {
    public static void main(String[] args) {
        Map<String,String> mp=new HashMap<>();
        mp.put("1","abes");
        mp.put("2","hamza");
        mp.put("3","sedik");
        // using synchronized map
       Map<String,String> smp =Collections.synchronizedMap(mp);
       System.out.println(smp);

       // using concurrentHashMap
        ConcurrentHashMap<String,String> chmp=new ConcurrentHashMap<>();
        chmp.put("usa","NY");
        chmp.put("UK","WDC");
        chmp.put("GER","Berlin");
    }
}
