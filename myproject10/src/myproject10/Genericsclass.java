package myproject10;
public class Genericsclass<u> {
	 u obj;
		Genericsclass(u obj) {
			this.obj = obj;
		}
		public u display() {
			return this.obj;
		}
		public static void main(String[] args) {
			Genericsclass<String> a = new Genericsclass<String>("this is java");
			System.out.println( "String "   +a.display());
			
			Genericsclass<String> a1 = new Genericsclass<String>("welcome");
			System.out.println("value =="+a1.display());

			Genericsclass<Integer> a2= new Genericsclass<Integer>(25);
			System.out.println("integer ="+a2.display());

			Genericsclass<String> r = new Genericsclass<String>("javatpoint");
			System.out.println("this is string value "   +r.display());

			Genericsclass<String>t = new Genericsclass<String>("eclipse");
			System.out.println(" string value =="+t.display());

			Genericsclass<String> t1 = new Genericsclass<String>("welcome");
			System.out.println("weclome to !="+t1.display());

			Genericsclass<String> A = new Genericsclass<String>("source");
			System.out.println(" string value =="+A.display());

			Genericsclass<Integer> t2 = new Genericsclass<Integer>(80);
			System.out.println("interger value is="+t2.display());

			Genericsclass<String> y = new Genericsclass<String>("file");
			System.out.println("file is="+y.display());
		}
}


