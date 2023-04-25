import pkg.*;
public class starter{
	public static void main(String[] args){
		// Create a for each loop for the given Integers 2D Array
		Integer[][] arr1 = {{9,8,7},{6,5,4},{3,2,1}};

		// Create a for each loop for the given Dog 2D Array
		Dog[][] arr2 = new Dog[5][4];
		populateDog(arr2);

		// Create a for each loop to print each letter of the String 2D array on a new line
		String[][] arr3 = {{"abc","def"},{"ghi", "jkl"},{"mno","pqr"}};

	}

	
	public static void populateDog(Dog[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				arr[i][j] = new Dog();
			}
		}
	}
}
