package orderstatistics;

public class Main {
	public static void main(String[] args) {
		KthSmallst ob = new KthSmallst(); 
        int arr[] = {15,12,7,14,19,24,25}; 
        int n = arr.length,k = 5; 
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
    }

}
