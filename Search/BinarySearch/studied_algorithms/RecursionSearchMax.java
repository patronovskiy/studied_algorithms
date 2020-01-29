package studied_algorithms;

import java.util.Arrays;

public class RecursionSearchMax {

	public static void main(String[] args) {
		int [] arr = {1, -3, 14, 88, 999, -1000, 11, 2, 66, 67, 66};
		System.out.println("Array: " + Arrays.toString(arr));
		int max = getMax(arr);
		System.out.println("Maximal element of array: " + max);
	}
	
	//recursively cut the array until 2 elements are left in
	static int getMax(int [] arr) {
		if (arr.length < 2) {
			return (arr.length == 1) ? arr[0] : 0;
		}
		if (arr.length == 2) {
			return (arr[0] > arr[1]) ? arr[0] : arr[1];
		} else {
			return (arr[0] > getMax(Arrays.copyOfRange(arr, 1, arr.length))) ? arr[0] : getMax(Arrays.copyOfRange(arr, 1, arr.length)); 
		}
	}

}
