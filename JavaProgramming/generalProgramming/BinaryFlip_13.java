package generalProgramming;

//Write a program to replace 0's with 1's and 1's with 0's from the below Input :101101 Output:010010
public class BinaryFlip_13 {

	public static void main(String[] args) {

		String str = "101101a1d1";
		String result = "";

		for (char ch : str.toCharArray()) {
			
			if (ch == '0') {
				result = result + '1';
				
			} else if (ch == '1') {
				
				result = result + '0';
			}
			else {
                // Optional: handle invalid characters
                System.out.println("Invalid character found: " + ch);
                
                
		}


	}
		
		System.out.println(result);


}
}
