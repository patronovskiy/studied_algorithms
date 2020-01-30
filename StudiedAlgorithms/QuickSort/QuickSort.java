package QuickSort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {1, -22, 3, 14, 10000, 999, -80, 2, 3, 0, 0, 8};

		int[] newArr = mySort(arr);
		System.out.println(Arrays.toString(newArr));

		int[] arr1 = {1,2,3};
		int[] arr2 = {4};
		int[] arr3 = {5,6,7,8,9};

		System.out.println(Arrays.toString(concatArrays(arr1, arr2, arr3)));
	}
	
	static int[] mySort (int[] arr) {
		
		if (arr.length < 2) {
			return arr;
		} else {
			int pivot = arr.length / 2;
			int[] pivotElem = {arr[pivot]};
			
			int[] lessElems = new int[arr.length];
			int lessElemsCounter = 0;
			
			int[] moreElems = new int[arr.length];
			int moreElemsCounter = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (i != pivot) {
					if (arr[i] <= arr[pivot]) {
						lessElems[lessElemsCounter] = arr[i];
						lessElemsCounter++;
					} else {
						moreElems[moreElemsCounter] = arr[i];
						moreElemsCounter++;
					}
				}
			}
			
			lessElems = Arrays.copyOfRange(lessElems, 0, lessElemsCounter);
			moreElems = Arrays.copyOfRange(moreElems, 0, moreElemsCounter);
			return concatArrays(mySort(lessElems), pivotElem, mySort(moreElems));
		}
		
	}
	
	static int[] concatArrays(int[] arr1, int[] arr2, int[] arr3) {
		int [] newArr = new int[arr1.length + arr2.length + arr3.length];
		
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}
		
		newArr[arr1.length] = arr2[0];
		
		for (int i = arr1.length + 1, j = 0; i < arr1.length + arr3.length+1; i++, j++) {
			newArr[i] = arr3[j];
		}
			
		return newArr;
	}

}
