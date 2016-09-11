/**
 * Given an array {1, 4, 45, 6, 10, 8} find a subset of 3 elements whose sum equals the value of 22. So the output should have values : 4 10 and 8.
 */

class sumofsubset {
	boolean threenumbers(int myList[], int size, int sum){
		// Fix the first element
		for (int i = 0; i < size-2; i++){
			
			// Fix the second element
			for (int j = i + 1; j < size-1; j++){
				
				//Fix the third element
				for (int k = j + 1; k < size; k++){
					if (myList[i] + myList[j] + myList[k] == sum){
						System.out.println("The three numbers when added give 22 are :- " + myList[i] + " , " + myList[j] + " , " + myList[k]);
						return true;
					}					
				}
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		int myList[] = {1, 4, 45, 6, 10, 8};
		int sum = 22;
		int size = myList.length;
		sumofsubset obj = new sumofsubset();
		obj.threenumbers(myList, size, sum);
	}
}
