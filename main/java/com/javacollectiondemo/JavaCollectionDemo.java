package com.javacollectiondemo;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doListDemo();
        doStackDemo();
        doQueueDEmo();
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
    private static void doQueueDEmo() {
        System.out.println("\nIn DoQueueDemo");
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("Jai Shankar");
        queue.add("Rai");
        System.out.println("Head: "+queue.element());
        System.out.println("Head: "+queue.peek());
        System.out.println("Iterating The queue elements");
        Iterator itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.println(queue);
            break;
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements");
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()) {
            System.out.println(queue);
            break;
        }
    }
}
