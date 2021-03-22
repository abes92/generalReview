package CollectionList;


import java.util.ArrayList;//list allows duplicate
//maintains insertion order
import java.util.Collections;
import java.util.Iterator;

public class ArrList {//is from list interface
 //is slow compare to linkedList when assigning values
 //incase of fletch value is faster
    public static void main(String[] args) {
       ArrayList arr=new ArrayList();
        arr.add(23);
        arr.add(3);
        arr.add(3);
        arr.add(6);
        arr.add(7);

        System.out.println(arr.size());
//    for( int i=0;i<arr.size();i++) {
//        System.out.println(arr.get(i));
//    }
        arr.add("lyly");
        arr.add("mimi");
        arr.add("titi");
        arr.add(1,6);

        for( int b=0;b<arr.size();b++){
            System.out.println(arr.get(b));
    }
        System.out.println("*******************");
        arr.remove(3);
        arr.remove(4);
//        arr.remove(5);

        arr.remove(3);
        for( int b=0;b<arr.size();b++){// we use for when we work with index
            System.out.println(arr.get(b));
        }
     System.out.println("11111########################");
        //non generic vs generic
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(15);
        ar.add(8);
        ar.add(5);
        ar.add(6);
        Collections.sort(ar);
       // ar.add("addd"); not allowed because we are dealing only with integer values.
     for(int q=0;q<ar.size();q++){
      System.out.println(ar.get(q));
     }
     System.out.println("########################");
        ArrayList<String> ar1=new ArrayList<String>();
        ar1.add("abes");
        ar1.add("taieb");
        ar1.set(0,"Ab");
        for(int q=0;q<ar1.size();q++){
         System.out.println(ar1.get(q));
        }
     System.out.println("########################");
     Employee e1=new Employee(28,"abes","QA");
     Employee e2=new Employee(21,"sedik","Dev");
     Employee e3=new Employee(29,"hamza","BA");
     ArrayList<Employee> em=new ArrayList<Employee>();
     em.add(e1);
     em.add(e2);
     em.add(e3);
     Iterator<Employee> it=em.iterator();
     while(it.hasNext()){
      Employee e=it.next();
      System.out.println(e.age+" "+e.name+" "+e.dep);
     }
     System.out.println("########################");
     arr.addAll(ar);
     for( int i=0;i<arr.size();i++){
      System.out.println(arr.get(i));
     }
     System.out.println("########################");
     arr.addAll(ar1);
     for( int i=0;i<arr.size();i++){
      System.out.println(arr.get(i));
     }

     System.out.println(arr.contains(90));
     System.out.println("########################");
     ArrayList arr1=new ArrayList();
     arr1.add(23);
     arr1.add(3);
     arr1.add(3);
     arr1.add(56);
     arr1.add(43);
     arr1.add(73);
     System.out.println(arr1.retainAll(arr));
     for(int i=0;i<arr1.size();i++){
      System.out.println(arr1.get(i));
     }

    }
}
