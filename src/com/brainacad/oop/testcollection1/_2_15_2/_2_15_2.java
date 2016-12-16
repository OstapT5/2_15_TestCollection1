package com.brainacad.oop.testcollection1._2_15_2;

import java.util.LinkedList;
import java.util.List;

/*Create a class _2_15_3 with a main() method. Add to method main() code that declares list
 variable (of List type) of string objects as LinkedList<String>.
 Write code to fill this list in loop with string values like: “num_” and number of current
 iteration (from 0 to 10). But element insertion point must be generated randomly (from
 0 to current collection length).
 Add code which iterates over list and print current element value to console.
 Execute the program.*/

public class _2_15_2 {

    public static void main(String[] args) {

        List<String> lst = new LinkedList();

        for (int i = 0; i < 10; ++i) {
            int min = 0, max = lst.size();
            int position = (int) (min + Math.random() * (max -min));
            lst.add(position, "num_" + i);
        }
            for(String print : lst) System.out.println(print);

    }
}
