package loops_7;

/*The do-while loop in Java is a control flow statement that executes 
a block of code at least once, and then repeatedly executes the block as 
long as a given condition is true. The key feature of the do-while loop is 
that it checks the condition after the code block has been executed,
ensuring that the block runs at least once regardless of the condition.*/


public class DoWhileExample {

    public static void main(String[] args) {
    	
        int i = 0;
        
        do {
            System.out.println("The value of i is: " + i);
            i++;
        } 
        
        while (i <= 5);
    }
}
