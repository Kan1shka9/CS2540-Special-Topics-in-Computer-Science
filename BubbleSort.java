/**
 * Sort an array in descending order using Bubble Sort:
 * Output:
 * Array Before Bubble_Sort:
 * 15 1 20 55 5 100 
 * Array After Bubble_Sort:
 * 100 55 20 15 5 1
 */
public class BubbleSort {

	public static void main(String[] args) {
		 int arr[] = new int[]{15, 1, 20, 55, 5, 100};
		 
		 System.out.println("Array Before Bubble_Sort: ");
			for (int j = 0; j < arr.length; j++) {
				  System.out.print(arr[j] + " ");
			}
			
		 sort(arr);
		 System.out.println("");
		 
		 System.out.println("Array After Bubble_Sort: ");
			for (int j = 0; j < arr.length; j++) {
				  System.out.print(arr[j] + " ");
			}
	}
	
	public static void sort(int[] arr){ 
		int temp;
		boolean flag = true;
		
		while (flag) {
			flag= false;
			for (int j = 0; j < arr.length-1; j++){
				if ( arr[ j ] < arr[j+1] ) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
		}
	}
}