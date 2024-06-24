package question2;

//2. Write a linear search algorithm to return index of last occurance of key.

public class Program {
	
	public static int linearSearch(int arr[], int key) {
		
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key ) {
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,36,6,5,8};
		int key = 5;
		int result = linearSearch(arr, key);
		System.out.println(result == -1 ? "Element Not Found" : "Index of Last Occurence : " + result );
	}

}
