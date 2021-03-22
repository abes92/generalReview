package MapConcept;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableConcept {
    public static void main(String[] args) {
        Hashtable<Character,String> ht=new Hashtable<>();
        ht.put('e',"said");
        ht.put('a',"abes");
        ht.put('w',"sofian");
        ht.put('p',"mokran");
        ht.put('g',"nohand");
        ht.put('d',"ilias");

        for(Map.Entry ab:ht.entrySet()){
            System.out.println(ab.getKey()+" "+ab.getValue());
        }
        System.out.println("*********************************");
        employees e1=new employees(134,"Taieb","Abes","abestaieb@gmail.com",120000);
        employees e2=new employees(174,"Taieb","Hamza","hamzataieb@gmail.com",130000);
        employees e3=new employees(164,"Taieb","Sedik","sediktaieb@gmail.com",150000);
        employees e4=new employees(144,"Tayeb","Iddir","iddirtayeb@gmail.com",100000);
        Hashtable<Integer,employees> h=new Hashtable<>();
        h.put(1,e1);
        h.put(2,e2);
        h.put(3,e3);
        h.put(4,e4);
        for(Map.Entry<Integer,employees> e:h.entrySet()){
            int ent=e.getKey();
            employees ep=e.getValue();
            System.out.println(ent+" key");
            System.out.println(ep.id+" "+ep.FN+" "+ep.LN+" "+ep.email+" "+ep.salary);
        }
    }
}
