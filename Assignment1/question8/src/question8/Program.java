package question8;

import java.util.Arrays;

//8. to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total
//no. of ele's less than or equal to x (including x).
//Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4

public class Program {
	
	public static int findRank(int arr[], int rank) {
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= rank) cnt++;
		}
		return cnt;
	}
	
	public static int findRank2(int arr[], int rank) {
		Arrays.sort(arr);
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= rank) cnt++;
			else break;
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Rank is : "+findRank(arr, 4));		
		System.out.println("Rank is : "+findRank2(arr, 4));

	}

}
