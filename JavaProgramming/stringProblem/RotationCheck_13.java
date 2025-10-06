package stringProblem;

/*Two strings are rotations if one is a substring of the other repeated twice.

📌 For example:

"abcd" and "cdab" are rotations.
If you do "abcdabcd" → it contains "cdab".*/

public class RotationCheck_13 {
	
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdad";

        // Step 1: Check if lengths are equal
        if (s1.length() != s2.length()) {
            System.out.println("Not rotations - Edge Case");
            return;
        } 
        // Step 2: Check if s2 is a substring of s1+s1
        if ((s1 + s1).contains(s2)) {
            System.out.println("Strings are rotations of each other");
        } else {
            System.out.println("Not rotations");
        }
    }
}

