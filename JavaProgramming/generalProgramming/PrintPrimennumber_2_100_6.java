package generalProgramming;

public class PrintPrimennumber_2_100_6 {
	
	
	
	

	public static boolean isPrime(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i = 2 ; i<num-1 ; i++) {
			
			if(num%i == 0) {
				
				return false;
			}
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		 System.out.println("Prime numbers between 2 and 100 are:");
		
		for (int i = 2; i<=100; i++) {
			
			if(isPrime(i)) {
				System.out.println(i + " is PRIME");
			}
		}
	}
	
  
     

   }

