package question6;

//6. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
//	not found, return -1.


public class Program {
	
	public static int linearSearch(int arr[], int key, int occ) {
		
		int index = -1;
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key ) {
				cnt++;
				if(occ == cnt) {
					index = i;
					break;
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,36,6,5,8,5,6};
		int key = 5;
		int occ = 3;
		int result = linearSearch(arr, key, occ);
		System.out.println(result == -1 ? "Element Not Found" : "Index of "+ occ +" Occurence : " + result );
	}

}
