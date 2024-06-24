package question7;

import java.util.HashMap;
import java.util.Map;

//7. find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3

public class Program {
	
	public static int firstNonRepeating1(int arr[])
	{
	    for (int i = 0; i < arr.length; i++) {
	        int j;
	        for (j = 0; j < arr.length; j++)
	            if (i != j && arr[i] == arr[j])
	                break;
	        if (j == arr.length)
	            return arr[i];
	    }
	    return -1;
	}
	 
	static int firstNonRepeating2(int arr[])
    {

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
            else {
                m.put(arr[i], 1);
            }
        }
        
        for (int i = 0; i < arr.length; i++)
            if (m.get(arr[i]) == 1)
                return arr[i];
        return -1;
    }

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
	    int result = firstNonRepeating1(arr);
	    System.out.println(result == -1 ? "No Element Found " : "Element Found : "+ result );
	    result = firstNonRepeating2(arr);
	    System.out.println(result == -1 ? "No Element Found " : "Element Found : "+ result );

	    
	}

}
