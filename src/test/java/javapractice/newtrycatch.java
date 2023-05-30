package javapractice;

import java.util.ArrayList;

public class newtrycatch {

	
	//exception in java: exception means code error. to handle exception we use try and catch block.
	public static void main(String[] args) {

ArrayList<String>month=new ArrayList<String>();

		month.add("jan");
		month.add("feb");
		month.add("mar");
		month.add("april");
			
	try {
		 month.get(2);
	System.out.println( month.get(5));
	}
	catch(Exception e) {
		System.out.println("may");
	}	
		
		
	
		
		
		try {
			//block of code
			int []numbers = {1,2,3};
			//System.out.println(numbers[4]);
		}
catch(Exception e) {
	//we handle exception we write a message here
	//System.out.println("code in array fail");
}
}
}