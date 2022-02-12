package sorting;

public class SelectionSort {
	public static void main(String[] args) {

	    int[] arr = {98,55,12,5,37,88,40,100};
	    System.out.println("Length of the array:"+arr.length);
	    selectionSort(arr);
	    System.out.println("The sorted elements are:");
	    for(int i:arr){

	        System.out.println(i);
	         }
	     }

	    public static void selectionSort(int[] arr){

	        for(int i=0;i<arr.length-1;i++){

	            int index =i;
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[j]<arr[index]){

	                    index =j;
	                }

	            }
	            int smallNumber = arr[index];
	            arr[index]= arr[i];
	            arr[i]= smallNumber;
	        }

	    }

}
