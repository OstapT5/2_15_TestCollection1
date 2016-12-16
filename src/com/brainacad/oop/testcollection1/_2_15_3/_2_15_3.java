package com.brainacad.oop.testcollection1._2_15_3;

/*Create a class _2_15_3 with a main() method. Add to method main() code to create both an
ArrayList and LinkedList (of String parameter type), and fill each in loop with string
values like: “num_” and number of current iteration (from 0 to 10).
Print each list using an ordinary Iterator. Then insert one list (ArrayList) into the other
(LinkedList) by using an ListIterator, inserting at every other location.
Now perform the insertion elements of the first list in reverse order, moving through the
element from end to beginning in the second list.
Write a static method printElements() that uses an Iterator to step through an Collection
and print the each element value in the container.
Execute the program.*/

import java.util.*;

public class _2_15_3 {

    public static void main(String[] args) {

        List<String> arrList = new ArrayList<>();
        List<String> lnkList = new LinkedList<>();

        for(int i = 0; i < 10; ++i) {
            arrList.add("num_" + i);
            lnkList.add("num_" + i);
        }

        System.out.println(arrList);

        System.out.println(lnkList);

        Iterator<String> arrItr = arrList.iterator();
        while (arrItr.hasNext()) {
            String element = arrItr.next();
            lnkList.add(element);
        }

        System.out.println(lnkList);

        for(int i = arrList.size() - 1; i >=0; --i) {
            lnkList.add(arrList.get(i));
        }

        System.out.println(lnkList);
    }
}
