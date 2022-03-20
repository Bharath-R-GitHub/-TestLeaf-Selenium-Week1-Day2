package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		int size = arr.length;
		int j = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] != j) {
				System.out.println("The Missing Element in the given Array is " + j);
				break;
			} else {
				j++;
			}
		}
	}
}
