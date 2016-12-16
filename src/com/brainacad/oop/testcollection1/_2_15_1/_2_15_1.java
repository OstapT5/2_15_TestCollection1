package com.brainacad.oop.testcollection1._2_15_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Create a class _2_15_3 with a main() method. Add to method main() code that declares list
 variable (of List type) of string objects as ArrayList<String>.
  Write code to fill this list in loop with string values like: “number_” and number of
  current iteration (from 0 to 10). Add code which iterates over list and print current
  element value to console.*/

public class _2_15_1 {

    public static void main(String[] args) {

    List<String> list = new ArrayList<>();

        for(int i = 0; i < 10; ++i)
            list.add("number_" + i);

        for(String element : list)
            System.out.println(element);

        list.forEach(System.out::println);
        list.forEach((e) -> System.out.println(e));
    }
}
