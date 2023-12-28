package javaPackage;

public class LocalvsGlobal {
	static byte number = 100;
	static short number2 = 1000;
	static int number3 = 100000;
	static long number4 = 10000000000L;
	static float number5 = 100.12345f;
	static double number6 = 100.98765432112345;
	static boolean myansweris = true;
	static char variable = 'S';
	public static void main(String[] args) {
		String text = "My Coding is ";
		System.out.println(number);
		System.out.println(number2);
	    System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(text + myansweris);
        System.out.println("My favorite letter is " + variable);
        
		secondmethod();
	
	}

	public static void secondmethod()  {
		System.out.println(number+number2);
	}
}
