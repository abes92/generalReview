package CollectionList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayListCompare {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("a","c","b","d","f"));
        ArrayList<String> arr1=new ArrayList<>(Arrays.asList("a","b","c","e","d"));
        ArrayList<String> arr2=new ArrayList<>(Arrays.asList("a","c","b","d","f"));
        //you sort the array first
        Collections.sort(arr);
        Collections.sort(arr1);
        Collections.sort(arr2);
        //equality
        System.out.println(arr.equals(arr1));
        System.out.println(arr.equals(arr2));
        //find out the additional element
        arr.removeAll(arr1);
        System.out.println(arr);
        //find out the missing element
        arr1.removeAll(arr);
        System.out.println(arr1);
        ArrayList<String> arr3=new ArrayList<>(Arrays.asList("abes","coca","bmw","dynamic","ford"));
        ArrayList<String> arr4=new ArrayList<>(Arrays.asList("abes","bmw","cycy","elite","dynamic"));
        //find out the common element/s
        arr3.retainAll(arr4);
        System.out.println(arr3);

    }
}
