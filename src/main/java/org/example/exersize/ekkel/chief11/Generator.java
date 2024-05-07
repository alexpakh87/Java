package org.example.exersize.ekkel.chief11;

import java.util.*;

public class Generator {
    String[] name = {"Rambo", "Trus", "Balbes", "Byivalyi", "Shuric", "Rambo", "Sadko"};
    ArrayList<String> arrayList = new ArrayList<>();
    List<String> arrayList1 = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<>();
    HashSet<String> hashSet = new HashSet<>();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    TreeSet<String> treeSet = new TreeSet<>();


    void next() {
        for (String st : name) {
            System.out.println(st);
        }

        for (int i = 0; i < name.length; i++) {
            arrayList.add(name[i]);
            linkedList.add(name[i]);
            hashSet.add(name[i]);
            linkedHashSet.add(name[i]);
            treeSet.add(name[i]);
            arrayList1.add(name[i]);
        }
        arrayList.add(1, "Vinnypukh");
        linkedList.add(1, "Vinnypukh");
        hashSet.add("Vinypukh");
       // linkedHashSet.addFirst("Vinnypukh");
        treeSet.add("Vinnypukh");

        // Collections.sort(linkedList);
        // arrayList1.subList(1, 4).clear();

        ListIterator<String> iterator =  arrayList1.listIterator();
        while (iterator.hasNext()) {
            String s = iterator.next().toUpperCase();
            iterator.set(String.valueOf(arrayList1));


            //System.out.println( arrayList1.iterator().next());
            //   arrayList1 = Collections.singletonList(iterator.next().toUpperCase());

            //System.out.println(s);
            if (iterator.hasNext() == false) {
                iterator.remove();
                System.out.println(arrayList1);
            }

        }

//        System.out.println("array list " + arrayList);
//        System.out.println("linked list " + linkedList);
//        System.out.println("hashSet " + hashSet);
//        System.out.println("LinkedHashSet " + linkedHashSet);
//        System.out.println("TreeSet " + treeSet);
        System.out.println("arraylist1" + arrayList1);
    }


    public static void main(String[] args) {
        Generator g = new Generator();
        g.next();
    }

}
