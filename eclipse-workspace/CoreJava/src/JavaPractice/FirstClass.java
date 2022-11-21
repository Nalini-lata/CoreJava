package JavaPractice;

public class FirstClass {

	int a= 10;
	public void getData() {
		System.out.println("I am a firstClass");
		
	}
	
	public static void main(String[] args) {
		
		FirstClass obj= new FirstClass();
		
		
		  SecondClass obj1= new SecondClass(); obj1.setData();
		 
		obj.getData();
		
		System.out.println(obj.a);
		

	}

}
