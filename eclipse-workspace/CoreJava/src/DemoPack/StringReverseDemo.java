package DemoPack;

public class StringReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "madam";
		String t= "";
		
	for(int i=s.length()-1;i>=0;i--) {
		
		t= t+s.charAt(i);
		
		//System.out.print(s.charAt(i));
	}
		System.out.println(t);
		
		
}
}
