
package hashmapexample;

import java.util.HashMap;

/**
 *
 * @author bethan
 */
public class HashMapExample {
    
    public static void main(String[] args) {  
        
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Karl", 123123);
        phonebook.put("Karl", 222222);
        phonebook.put(null, 000);
        if (phonebook.containsKey("Kevin")) {
            phonebook.remove("Kevin");
        }
        phonebook.clear();
        System.out.println(phonebook);
        
    }
    
}
