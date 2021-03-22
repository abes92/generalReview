package CollectionQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueConcept {
    public static void main(String[] args) {
        Deque<String> st=new ArrayDeque<>();
        st.add("djilali");
        st.add("sliman");
        st.add("abes");
        st.add("azem");
        st.add("matoub");
        st.add("lounes");
        System.out.println(st.offerFirst("hamza"));
        System.out.println(st.pollLast());
        for(String s:st){
            System.out.println(s);
        }

    }
}
