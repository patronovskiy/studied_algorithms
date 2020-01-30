package BinarySearch;

public class MyBinarySearch {
	
	public static int searchItem(int item, int [] array) {
		
		//search item in sorted array and return index of it
		//if item is not found, return -1
		
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high)/2;
		
		int step = 0;
		//just for visualisation of quantity of steps in search
		
		while(low <= high) {
			++step;
			System.out.println("mid: " + mid);
			if (array[mid] == item) {
				System.out.println("steps: " + step);
				return mid;
			} else if (item < array[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = (low + high)/2;
			
		}
		System.out.println("steps: " + step);
		return -1;
	}

}
