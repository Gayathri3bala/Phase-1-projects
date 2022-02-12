package arrayrotation;

public class arrayRotation {
	public void rotate(int n[], int k) {


		if (k > n.length)
			k = k % n.length;

		int result[] = new int[n.length];
		for (int i = 0; i < k; i++) {
			result[i] = n[n.length - k + i];
		}
		int j = 0;
		for (int i = k; i < n.length; i++) {
			result[i] = n[j];
			j++;
		}
		System.arraycopy(result, 0, n, 0, n.length);
	}
}
