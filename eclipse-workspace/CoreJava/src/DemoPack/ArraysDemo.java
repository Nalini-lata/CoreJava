package DemoPack;

public class ArraysDemo {
	
	// A container which contains multiple value of same data type.	
	//[] this indicates in terms of array
	// Declares an array  and allocates memory with value with 5 value  int a[] = new int[5];
	// array start with zero index
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[5];
		a[0] =2;
		a[1] =6;
		a[2] =4;
		a[3]= 5;
		a[4]= 7;
		
             for(int i =0; i<a.length;i++) {
			
			
			System.out.println(a[i]);
		}
		
		
		// Dynamically allocated memory
		 int b[]={1,4,3,5,7,8};
		 
		  for(int i =0; i<b.length; i++) {
			  
			  System.out.println(b[i]);
		  }
		
		
		
		
		
		
		
	}

}
