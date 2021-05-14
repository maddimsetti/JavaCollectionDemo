package com.javacollectiondemo;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doListDemo();
    }
    private static void doListDemo() {
        System.out.println("In doListDemo");
        //creating list
        List<String> list = new LinkedList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //printing the list
        System.out.println(list);
        list.remove(2);
        list.add("Krishna");
        System.out.println(list);
    }
}
