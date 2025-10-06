package arraysProblem;

/*Given an array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.

Examples:

Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
Output: {3, 4, 5, 6, 1, 2}
Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}

Input: arr[] = {1, 2, 3}, d = 4
Output: {2, 3, 1}
Explanation: The array is rotated as follows:

After first left rotation, arr[] = {2, 3, 1}
After second left rotation, arr[] = {3, 1, 2}
After third left rotation, arr[] = {1, 2, 3}
After fourth left rotation, arr[] = {2, 3, 1}


[Expected Approach 2] Using Reversal Algorithm - O(n) Time and O(1) Space
*
*/


public class RotateArray_21 {

    // Utility function to reverse part of the array between indices start and end
    private static void reverse(int[] arr, int start, int end) {
    	
        while (start < end) { // keep swapping until pointers meet
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to left rotate the array by d positions
    public static void leftRotate(int[] arr, int d) {
       
    	int n = arr.length;
        d = d % n; // handle cases where d >= n (e.g., rotating 7 times on size 6 is same as rotating once)

        // Step 1: Reverse the first d elements
        // Example: for arr = [1,2,3,4,5,6], d=2
        // reverse [1,2] → [2,1,3,4,5,6]
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining elements from index d to n-1
        // reverse [3,4,5,6] → [2,1,6,5,4,3]
        reverse(arr, d, n - 1);

        // Step 3: Reverse the whole array
        // reverse [2,1,6,5,4,3] → [3,4,5,6,1,2]
        reverse(arr, 0, n - 1);
    }

    // Driver code to test
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;

        leftRotate(arr, d); // perform left rotation

        // Print the result
        System.out.print("Array after " + d + " left rotations: ");
        for (int num : arr) {
            System.out.print(num + " "); // expected output → 3 4 5 6 1 2
        }
    }
}
