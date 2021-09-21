package Collections.ArrayList;
import java.util.*;

class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Sairaj");
        list.add("Shreya");
        list.add("Shraddha");
        list.add("Pruthvi"); 

        
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}