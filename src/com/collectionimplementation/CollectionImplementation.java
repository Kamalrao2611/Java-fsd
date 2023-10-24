package com.collectionimplementation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Vector;


public class CollectionImplementation {

    public static void main(String[] args) {

        System.out.println("Implementation of ArrayList : ");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        System.out.println(arr);

        // Implementation of Vector
        System.out.println("Implementation of Vector : ");
        Vector<Integer> element = new Vector<>();
        element.add(30);
        element.add(50);
        element.add(20);
        System.out.println(element);


        // Implementation of HashSet
        System.out.println("Implementation of HashSet : ");
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(101);
        set.add(103);
        set.add(102);
        System.out.println(set);


        // Implementation of LinkedHashSet
        System.out.println("Implementation of LinkedHashSet : ");
        LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
        set2.add(10);
        set2.add(50);
        set2.add(25);
        System.out.println(set2);
    } 





}