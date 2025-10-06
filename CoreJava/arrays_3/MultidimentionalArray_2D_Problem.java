package arrays_3;


//Print the smallest number from the 2D Array
public class MultidimentionalArray_2D_Problem {

	public static void main(String[] args) {
		
		int array[][] = {{1,2,3},{5,6,7},{8,9,1}};
		int min = array[0][0]; // Lets assume that the first element is the smallest
		
		//No. of Rows in 2D Array = array.length
		//No. of Columns in 2D Array = array[0].length
		
		for(int i = 0 ; i<array.length ; i++)
		{
			for (int j = 0 ; j<array[0].length; j++) {
				
				if(array[i][j] < min ) {
					
					min = array[i][j];
				}
			}
		}
		
		System.out.println("The Smallest no. is -- " + min);

	}

}
