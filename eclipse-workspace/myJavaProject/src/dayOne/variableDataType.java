package dayOne;

import java.util.Scanner;

public class variableDataType {

	
	int rollNo = 100; //instance variable
	static String collegeName = "ymca"; //static
	
	void genderMethod()
	{
		String gender = "male"; //local
		System.out.print("my sex is "+gender);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("what you want to be: ");
		
		gender = scan.next();
		
		System.out.println("your sex is changed to "+gender);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(collegeName+" fu#d me");
		
		variableDataType v = new variableDataType();
		v.genderMethod();
		
		
		System.out.println("Roll no :"+v.rollNo);
		

		
		
		
	}

}
