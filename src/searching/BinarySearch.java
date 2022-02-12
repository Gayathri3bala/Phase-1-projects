package searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 45, 54, 63, 72, 81, 90, 99 };
		System.out.println("Enter an Element to search:");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int arrlength = arr.length;
		binarySearch(arr, 0, key, arrlength);
		sc.close();
	}

	public static void binarySearch(int[] arr, int start, int key, int length) {

		int midValue = (start + length) / 2;
		while (start <= length) {

			if (arr[midValue] < key) {

				start = midValue + 1;
			} else if (arr[midValue] == key) {
				System.out.println("Element is found at index :" + midValue);
				break;
			} else {

				length = midValue - 1;
			}
			midValue = (start + length) / 2;
		}
		if (start > length) {

			System.out.println("Element is not found");
		}

	}

}
