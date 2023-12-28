package javaPackage;

public class ArraysDemo {

	public static void main(String[] args) {
		//int[] myintarray = new int[10];
		//myintarray[0] = 100;
		//myintarray[1] = 200;
		//myintarray[2] = 300;
		//System.out.println("Int Array Index at 0 is " + myintarray[0]);
		//System.out.println("Int Array Index at 1 is " + myintarray[1]);
		//System.out.println("Int Array Index at 2 is " + myintarray[2]);
		//System.out.println("Int Array Index at 3 is " + myintarray[3]);
		int[] myintarray = {100,200,300};
		int length1 = myintarray.length;
		for (int i=0; i<length1; i=i+1)
		{	
		System.out.println("Integer Array " +i+ " = " + myintarray[i]);
		}
		
		//String[] mystringarray = new String[10];
		//mystringarray[0] = "Tesla";
		//mystringarray[1] = "Jaguar";
		//mystringarray[2] = "BMW";
		//System.out.println("String Array Index at 0 is " + mystringarray[0] );
		//System.out.println("String Array Index at 1 is " + mystringarray[1] );
		//System.out.println("String Array Index at 2 is " + mystringarray[2] );
		//System.out.println("String Array Index at 3 is " + mystringarray[3] );
		
		String[] mystringarray = {"Tesla", "Jaguar", "BMW"};
		int length = mystringarray.length;
		for (int i=0; i<length; i++)
		{
		System.out.println("String Array Index " + i + "= " + mystringarray[i]);
		}
		
		

	}

}
