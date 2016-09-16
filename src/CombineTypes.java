//
public class CombineTypes {

	public static void main(String[] args) {
		System.out.println(combine(1,2) );
		System.out.println(combine(1,2.0) );
		System.out.println(combine("1","2") );
		// TODO Auto-generated method stub
	}
	// 
	public static int combine(int a, int b) {
		System.out.println("combine ints");
		return a + b;
	}

	public static double combine(double a, double b) {
		System.out.println("combine doubles");
		return a + b;
	}

	public static String combine(String a, String b) {
		System.out.println("combine Strings");
		return a + b;
	}

}
