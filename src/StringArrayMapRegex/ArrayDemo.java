package StringArrayMapRegex;

public class ArrayDemo {
	public static void main(String[] args) {

		//single-dimensional array
		int a[]= {12,15,24,25,26};
		System.out.println("\nLength of array: "+a.length);
		
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {1,3,5,7}, 
		            {2,6,4} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      
	         for(int i=0;i<b.length;i++) {
	        	 for(int j=0;j<b[i].length;j++) {
	        	 System.out.println("Elements of array b:"+b[i][j]);
	         }
	        		         
	}
}
}

	


