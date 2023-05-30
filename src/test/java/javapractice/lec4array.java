package javapractice;

public class lec4array {

	public static void main(String[] args) {
	// 1) syntax of Array--->Datatype[]variable name ={value1,value2};
		
	// Example: String[]months={"jan","feb"};
	//String[]months= {"jan","feb"};
	
	// Store elements in Array
	String[]states= {"tx","ny","ca","fl"};
		
	//access or read the element in Array
	//variable name and index no
	states[2]="ca";
	//System.out.println(states[2]);
	
	
	//change an Array element
	
	String[]day= {"sun","mon","tue","wed"};
	day[1]="sat";
	//System.out.println(day[1]);
	
	// Length of an Array---->variable name.length
	System.out.println(day.length);
	
	
	
	
	
		

	}

}
