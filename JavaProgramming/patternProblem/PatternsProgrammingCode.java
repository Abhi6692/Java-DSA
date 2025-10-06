package patternProblem;

public class PatternsProgrammingCode {

	//1 - 90 Degree  increasing * pattern 
	//*
	//**
	//***
	//****
	public static void statPattern_1(int n) { //n = A parameter that specifies the number of rows in the pattern.
		
		for(int i = 1; i <= n; i++) { //Each iteration represents a new row in the pattern.
			
			for(int j = 1; j <= i; j++) { //It controls how many asterisks (*) are printed in the current row.
				
				System.out.print('*');
			}

			System.out.println(); //After printing all asterisks for a row, this moves the cursor to the next line to start printing the next row.
		}

	}

	//------------------------------------------------------

	//2 - 90 Degree reverse * Pattern
	//****
	//***
	//**
	//*
	public static void statPattern_2(int n) {
		for(int i = 0; i <= n; i++) {
			for(int j = 1; j <=n-i; j++) {
				System.out.print('*');
			}

			System.out.println();
		}

	}

	//------------------------------------------------------
	
	//1 
	//1 2 
	//1 2 3 
	//1 2 3 4 
	//1 2 3 4 5
	public static void statPattern_3(int n) {
		
		
		for(int i = 1; i <= n; ++i) {
			int num = 1;

			for(int j = 1; j <= i; ++j) {
				System.out.print(num + " ");
				++num;
			}

			System.out.println();
		}

	}

	//------------------------------------------------------
	//1 
	//2 3 
	//4 5 6 
	//7 8 9 10  
	//11 12 13 14 15 

	public static void statPattern_4(int n) {
		int num = 1;

		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= i; ++j) {
				System.out.print(num + " ");
				++num;
			}

			System.out.println();
		}

	}

	
	//1 2 3 4 
	//5 6 7 
	//8 9 
	//10
	
	public static void statPattern_5(int n) {
		int num = 1;
		for(int i = 0 ; i<=n ; i++) {
			
			for(int j = 1 ; j<=n-i; j++) {
				
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	
	}
	
	

	//------------------------------------------------------

	public static void main(String[] args) {
		statPattern_1(4);
		System.out.println("-------------------");
		statPattern_2(4);
		System.out.println("-------------------");
		statPattern_3(5);
		System.out.println("-------------------");
		statPattern_4(5);
		System.out.println("-------------------");
		statPattern_5(4);
	}
}
