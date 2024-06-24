package question9;

import java.util.Arrays;

//9. Write a selection sort function to sort array and returns no of comparisions.

public class Program {
	
	static int selectionSort(int arr[]) {
		int cnt = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				cnt++;
				if(arr[j] <= arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {50, 70, 40, 60, 30, 20};
		System.out.println("Before Sort : " + Arrays.toString(arr));
		int cmp = selectionSort(arr);
		System.out.println("Before Sort : " + Arrays.toString(arr));
		System.out.println("No of comparisions : " + cmp);

		
	}

}
