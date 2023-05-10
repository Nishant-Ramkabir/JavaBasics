package OOPS;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1,2,3,4,5};
		
		
		for (int i : arr) {
			if (arr[i] == 5) {
				
				break;
				
			}
			System.out.println(arr[i]);	
			
		}

	}

}
