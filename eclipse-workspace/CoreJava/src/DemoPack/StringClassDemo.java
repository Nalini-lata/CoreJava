package DemoPack;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is a class
		// Two ways:- By new Kewword  and by literals
		
		
		
		String a= " Javatraining";
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e")); 
		
		//Not available so -1
		System.out.println(a.substring(3));
		System.out.println(a.substring(3, 6));
		System.out.println(a.concat("nalini learning"));
		// For removing white spaces use trim in string beforefirst charater white space so removed by trim
		System.out.println(a.trim());
		// For all upper case and lower case we use below method
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	
	// for split a string we use this
	String arr[]=a.split("t");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(a.replace("t","s"));
		
	}

}