package javapractice;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
HashMap<Integer,String>	person = new HashMap<Integer,String>();
		
		
person.put(1,"mohammad");
person.put(2,"ahmad");
person.put(3,"uddin");
//System.out.println(person);
		
	//System.out.println(person.remove(1));	
		
HashMap<String,Integer>item =new HashMap<String,Integer>();		
item.put("banana", 1);
item.put("orange", 2);
item.put("apple", 3);
	System.out.println(item.keySet());	
		
		
		
		
				
		HashMap<String,String>state= new HashMap<String,String>();
		
		state.put("tx", "dallas");
		state.put("ny","queens");
		state.put("mi", "dearborn");
		
		for(String a:state.keySet()) {
					
		//System.out.println("state name   "    +a);
		
		}
		
		for(String a:state.values()) {
		//	System.out.println("city name  "  + a);
		}
		
		//System.out.println(state.remove("ny", "queens"));
		
		
		
		
		
		
		//HashMap<String,String>name=new HashMap<String,String>();
				
//		name.put("Mohammad", "Hussain");
//		name.put("Ibrahim", "Ali");
//		name.put("Abdullah", "Syed");
//		name.put("Abdur", "Rahman");
//		name.put("Abdul", "Hameed");
		//System.out.println(name);
		
	// For loop:  and printing the First Name:
		//for(String a:name.keySet()) {
			//System.out.println ("First Name     " +  a);
		//}
		
	
		
		// For loop and printing the LastName:	
		
		//for(String a:name.values()) {
			//System.out.println("Last Name  "+a);
			
		}
		
		
		
		
		
		
		//for(String a:name.values()) {
		//	System.out.println(a);
		//}
		
		//for( String a:name.keySet()) {
		//	System.out.println(a);
		//}
		
		//for(String a:name.values()) {
		//	System.out.println(a);
	//	}
		
		//for(String a:name.keySet()) {
		//	System.out.println(a);
		}			
		
		
		
		
		
		
		
		

		
//		HashMap<String,String>capital=new HashMap<String,String>();
//		capital.put("Tx","Irving");
//		capital.put("Tx","dallas");
//		capital.put("Tx","plano");
//		capital.put("NY","queen");
//		capital.put("NY","lascolinas");
		
		//System.out.println(capital.get("Tx"));
		
		//System.out.println(capital.remove("Tx"));
		
		// syntax:  HashMap<Integer,String>Identification=new HashMap<Integer,String>();
		
//		Identification.put(01,"mohmmad");
//		Identification.put(02,"ali");
//		Identification.put(03,"hussain");
//		Identification.put(04,"ibrahim");
		
		
		//System.out.println(Identification.get(02));
		
		//System.out.println(Identification.remove(04));
		//
		//capital.remove("Tx");
		
		
		
		
		
		
		
		
		
		
		
	//}


