package CollectionList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicateFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,1,3,2,1,2,3,5,6,7,89,5,7,9,4,5,6,3));
        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>(arr);
        ArrayList<Integer> listWithoutDuplicate=new ArrayList<Integer>(lhs);
        System.out.println(listWithoutDuplicate);
//jdk 8 : stream
        ArrayList<Integer> arraylist=new ArrayList<Integer>(Arrays.asList(1,2,1,3,2,1,2,3,5,6,7,89,5,7,9,4,5,6,3));
      List<Integer> arrayListUnique= arraylist.stream().distinct().collect(Collectors.toList());
          System.out.println(arrayListUnique);
    }
}
