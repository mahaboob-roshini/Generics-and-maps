package myproject10;
import java.util.HashMap;
import java.util.IdentityHashMap;
public class Identitymap {
	public static void main(String []args) {
		 HashMap<Integer, String> h = new HashMap<>();
		 Integer i1 = new Integer(10);
		 Integer i2 = new Integer(10);
		 h.put(i1, "hash");
		 h.put(i2, "map");
		 h.put(new Integer(i2),"ma");
		 System.out.println(h);
		 IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
		 ihm.put(i1, "hash");
		 ihm.put(i2,"ma");
		 ihm.put(new Integer(i2), "map");
		 System.out.println(ihm);
		}
	}



