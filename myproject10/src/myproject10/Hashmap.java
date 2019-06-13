package myproject10;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class Hashmap {
public static void main(String[] args) {
			HashMap<Integer, String> h = new HashMap<>();
			h.put(1, "hello");
			h.put(2, "ball");
			h.put(3, "cat");
			h.put(4, "good");
			h.put(5, "allow"); 
			h.put(6, "null");
			h.put(6, "exit");
			Set<Integer>keys=h.keySet();
			for(Integer key:keys) {
				String l=h.get(key);
				System.out.println("value is"+l);
			}
			Set <Entry<Integer,String>>set=h.entrySet();
			for(Entry<Integer,String> entry:set) {
				int key=entry.getKey();
				String val=entry.getValue();
				System.out.println("key"+key);
				System.out.println("value"+val);
			}
}
}
			
			