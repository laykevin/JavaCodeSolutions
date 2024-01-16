
package linkedlistexample;

import java.util.LinkedList;

/**
 *
 * @author bethan
 */
public class LinkedListExample {
    
    
    public static void main(String[] args) {
    // Linked lists are better for adding and removing alot of things in the middle of the list. Generally use ArrayList
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
        
    }

    
}
