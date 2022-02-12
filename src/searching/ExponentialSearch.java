package searching;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	public static void main(String[] args) {

		int[] arr = { 26, 39, 52, 65, 78 };
		System.out.println("Enter element to find:");
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		in.close();
		int length = arr.length;
		int out = exponentialSearch(arr, length, value);

		if (out < 0) {

			System.out.println("Element is not present in the array");

		} else {

			System.out.println("Element is  present in the array at index :" + out);
		}

	}

	public static int exponentialSearch(int[] arr, int length, int value) {

		if (arr[0] == value) {
			return 0;
		}
		int i = 1;
		while (i < length && arr[i] <= value) {

			i = i * 2;
		}
		return Arrays.binarySearch(arr, i / 2, Math.min(i, length), value);
	}

}
