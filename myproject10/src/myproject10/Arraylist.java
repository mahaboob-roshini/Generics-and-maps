package myproject10;
import java.util.ArrayList;
public class Arraylist {
	public static void main(String[] args) {
ArrayList a = new ArrayList();
        a.add("project");
		a.add("eclipse");
	    a.add(10);
        a.add(10.5);
        a.add('!');
		for (Object object : a) {
			if(object instanceof String) {
				String s = (String)object;
				System.out.println("this is String value " +s);				
			} else if(object instanceof Integer) {
				Integer i = (Integer)object;
				System.out.println("this is Integer value " +i);
			} else {
				System.out.println("this is "+object.getClass().getSimpleName()+" value " +object);	
			}
			
		}
	}
}

		
	

