package DemoPack;

public class StringsConceptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//By string literals copy of objects will be not created
		// By new keyword it creates copy of an object if already available
		
		String a="hello";
		String b="hello";
		//a.concat("World");
	    System.out.println(a);
	    
	  //  Output is hello just because string is immutatble. String immutable because both reference variable point out same so it will create problem
	    // by new string we can add (If content is same then it creates only one memory(string c)
	    
	    
	    String c= a.concat("World");
	    System.out.println(c);
	    
	    
	    // We can modify original string by StringBuilder and StringBuffer
	    
	    // String Builder is not thread safe or it is non synchronized means rest all same as string buffer means string bufferallow other task after finishing
	    // first task nut string builder all multiple programs at a time so its not thread safe but string builder is faster
	    
	    //At parallel testing take string buffer if automation frame work at sequnctial then we can use there string builder 
	    
	    
	    
	    StringBuffer sb = new StringBuffer("Hello");
	    sb.append("world");
	    System.out.println(sb);
		sb.insert(2, "She");//heShelloworld
		
	    System.out.println(sb);
	    
	    sb.replace(5, 7, "aa"); //so included 5 but excluded7 heSheaaoworld
	    
	    System.out.println(sb);
	
	     sb.deleteCharAt(12);
	     System.out.println(sb);
	     
	     sb.reverse();
	     System.out.println(sb);
	    
		// When we use equals method or ==
	     //.equals compare content like a= hello and B = hello //
	     //==  compare reference variable (address) a==b
	     
	     String x ="hello";
	     String y="hello";
	     String o = new String("hello");
	     
	     System.out.println(x.equals(y)); //true
	     System.out.println(x==y);// true
	     System.out.println(x.equals(o)); // true
	     System.out.println(x==o);// false
	     
	     //x.equalsIgnoreCase(o)
	     
	     
	     
	     

	}

}
