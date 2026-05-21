package day4;

public class SumOfDiagonalsinTwoD {
    // 1. Changed input type from int[] to int[][] because it's a 2D matrix
    public static int solution(int[][] arr) {
        int size = arr.length;
        int sum = 0;
        
        for (int i = 0; i < size; i++) {
            // Add primary diagonal element
            sum = sum + arr[i][i];
            
            // 2. Fixed secondary diagonal index calculation
            sum = sum + arr[i][size - 1 - i]; 
        } // 3. Moved the 'if' condition and return statement OUTSIDE the loop
        
        // 4. Subtract the center element only ONCE, after the loop finishes
        if (size % 2 == 1) {
            sum = sum - arr[size / 2][size / 2];
        }
        
        return sum;
    }

    public static void main(String args[]) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 9, 0} // 5. Fixed the stray comma here
        };
        
        System.out.println("The sum of the diagonals is: " + solution(arr));
    }
}

