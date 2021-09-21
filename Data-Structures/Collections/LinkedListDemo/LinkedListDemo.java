package Collections.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Sairaj");
        list1.add("Raviraj");
        list1.add("Pruthviraj");
        list1.add("Shreya");
        list1.add("Shraddha");
        list1.add("Ruturaj");

        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for (String name: list1) {
            System.out.println(name);
        }
    }
}