package arrayrotation;

public class test {
	public static void main(String[] args) {

		 arrayRotation r = new arrayRotation();

		int arr[] = { 5,10,15,20,25,30 };

		r.rotate(arr, 5);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
