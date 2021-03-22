package CollectionQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueConcept {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("laptop");
        pq.add("book");
        pq.add("table");
        pq.add("desk");
        pq.add("oven");
        pq.add("fork");
       pq.remove();//use to retrieve and remove the head of this element
        pq.poll();//used to retrieve and remove the first head of the elements or return null if this queue is empty
        for(String st:pq) {
            System.out.println(st);
        }
        System.out.println("**********************");
            pq.add("abes");
            pq.add("ahmed");
        for(String st:pq) {
            System.out.println(st);
        }
        System.out.println(pq.element());//used to retrieve the head element  but it does not remove it.
        System.out.println(pq.peek());//used to retrieve the head element and null value but it does not remove it.
    }
}
