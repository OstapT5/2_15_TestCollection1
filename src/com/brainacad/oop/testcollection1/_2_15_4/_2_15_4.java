package com.brainacad.oop.testcollection1._2_15_4;

import java.util.ArrayList;
import java.util.List;

public class _2_15_4 {

    private int numOfElem;
    private int maxNumb;

    public _2_15_4(int numOfElem, int maxNumb) {
        this.numOfElem = numOfElem;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate() {
        List<Integer> values = new ArrayList<>();
        for(int i = 0; i < numOfElem; ++i)
            values.add((int)(Math.random() * (maxNumb + 1)));
        return values;
    }
}
