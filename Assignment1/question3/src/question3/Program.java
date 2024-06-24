package question3;

//3. Write a program to print no of comparisions done to search a key in i. linear search ii. binary serach


public class Program {
	
	public static int linearSearch(int arr[], int key) {
		
		int comp = 0;
		for(int i = 0; i < arr.length; i++) {
			comp++;
			if(arr[i] == key) break;
		}
		return comp;
	}
	
	public static int binarySearch(int arr[], int key) {
		
		int comp = 0;
		int start = 0, end = arr.length -1;
		while(start <= end) {
			comp++;
			int mid = (start + end) / 2;
			if(arr[mid] == key) break;
			else if(arr[mid] > key) end = mid -1;
			else start = mid + 1;		
		}
		return comp;
	}

	public static void main(String[] args) {
	
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		System.out.println("linear search comparisions : " + linearSearch(arr, 60));
		System.out.println("Binary search comparisions : " + binarySearch(arr, 60));
		
	}

}
