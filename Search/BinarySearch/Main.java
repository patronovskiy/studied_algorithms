import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int [] arr = {-3, -1, 0, 1, 5, 10, 26, 39, 40, 999};
		
		System.out.println("Array: " + Arrays.toString(arr) + "\n");
		
		int index1 = MyBinarySearch.searchItem(-3, arr);
		System.out.println("index of -3: " + index1 +"\n");
		
		int index2 = MyBinarySearch.searchItem(39, arr);
		System.out.println("index of 39: " + index2 +"\n");
		
		int index3 = MyBinarySearch.searchItem(0, arr);
		System.out.println("index of 0: " + index3 +"\n");
		
		int index4 = MyBinarySearch.searchItem(1000, arr);
		System.out.println("index of 1000: " + index4 +"\n");

	}

}
