package myproject10;
public class Genericfunction {
static <T> void display(T element) {
		System.out.println("the output is"+ element);
	}
	
	static <A> void print(A[] array) {
		for (A e : array) {
			System.out.println(e);
		}
	}
	
	public static void main(String []args) {
		display(25);
		display("project");
		
		Integer[] array = {10,20,30,40};
		Character carray[]= {'J','A','V','A'};
		print(array);
		print(carray);
		
	}
}





