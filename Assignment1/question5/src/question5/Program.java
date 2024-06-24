package question5;

//5. Implement binary search algorithm if array is sorted in descending order.

public class Program {

	public static int binarySearch(int arr[], int key) {
	
		int start = 0, end = arr.length -1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == key) return mid;
			else if(arr[mid] < key) end = mid -1;
			else start = mid + 1;		
		}
		return -1;
	}

	public static void main(String[] args) {
	
		int arr[] = {80, 70, 60, 50, 40, 30, 20, 10 };
		int key = 40;
		int result = binarySearch(arr, key);
		System.out.println(result == -1 ? "Element Not Found" : "Index of Key Found at : " + result );		
	}

}
