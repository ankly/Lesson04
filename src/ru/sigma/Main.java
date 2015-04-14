package ru.sigma;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Student08 on 14.04.2015.
 */
public class Main {
    public static void main (String [] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("linked");
        System.out.println(linkedList.get(0));


        arrayList.add("first");
        arrayList.add("second");
        arrayList.add(1, "ew");

       // Collections.sort(arrayList);

        for (int i = 0; i < 1000; i++) {
            arrayList.add ("bla" + (int)(Math.random()*1000));
            linkedList.add ("bla" + (int)(Math.random()*1000));

        }


        }





    }

}
