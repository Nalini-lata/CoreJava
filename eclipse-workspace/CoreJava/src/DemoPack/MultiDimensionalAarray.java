package DemoPack;

public class MultiDimensionalAarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * // a[row][Colmn]
		 * 
		 * int a [][] = new int[2][3];
		 * 
		 * //2 3 4 //7 8 9
		 * 
		 * a[0][0]= 2; a[0][1] =3; a[0][2] =4; a[1] [0] =7; a[1] [1] =8; a[1][2] =9;
		 * 
		 * System.out.println(a[1][0]);
		 */
	int b[][]= {{2,3,4},{7,8,9}};
		
		 for(int i=0; i<2; i++) {
			 
			 for (int j=0; j< 3;j++) {
				 
				 System.out.println(b[i][j]);
			 }
		 }
		
				
		
	

	}

}
