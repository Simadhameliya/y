package testing;

public class main {
	
	private static int a =10;
	public static void main(String[] args) {
		System.out.println("testing github");
		
		
		abc();
		xyz();
		
		
	}
	
	private static void abc() {
		System.out.println("inside abc");
		a = 50;
		printa();
	}

	private static void xyz() {
		System.out.println("inside xyz");
		
	}
	private static void printa() {
		System.out.println(a);
		
	}
}
