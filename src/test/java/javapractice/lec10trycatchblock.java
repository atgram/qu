package javapractice;

public class lec10trycatchblock {
	//exception in java:exceptions means code error.to handle exception we use try and catch
	public static void main(String[] args) {
		try {
			//block of code
			int[]numbers= {1,2,3};
			System.out.println(numbers[4]);
		
	

	}
catch(Exception e) {
	//we handle the exception,we write a message here
	System.out.println("code in array fail");
	
}
}
}
