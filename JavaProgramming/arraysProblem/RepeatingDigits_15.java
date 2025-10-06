package arraysProblem;

public class RepeatingDigits_15 {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 100 with repeating digits:");

        for (int i = 1; i <= 100; i++) {
        	
            String numStr = String.valueOf(i);
            
            char chrArray [] =  numStr.toCharArray();    
            

            // Loop through characters and compare their first and last index
            for (char ch : chrArray) {
            	
                if (numStr.indexOf(ch) != numStr.lastIndexOf(ch)) {
                	System.out.println(i);
    				break;
                    
                }
            }

            
        }
    }
}
