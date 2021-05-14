package com.javacollectiondemo;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doListDemo();
        doStackDemo();
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
    private static void doStackDemo() {
        System.out.println("\nIndoStackDemo");
        Stack<String> stack = new Stack<>();
        stack.push("Ayesha");
        stack.push("Ganesh");
        stack.push("Amit");
        stack.push("Garima");
        stack.push("Satya");
        System.out.println(stack);
        String pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack);
        String peek = stack.peek();
        System.out.println(peek);
        int search = stack.search("Krishna");
        if(search == -1) {
            System.out.println("NotFound");
        } else {
            System.out.println("Found");
        }
    }
}
