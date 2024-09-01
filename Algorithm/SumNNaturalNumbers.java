import java.util.Scanner;

public class SumNNaturalNumbers {
    
    // Method to find the sum of the first n natural numbers
    // This is First person Algorithm There we are using Algorithm
    // public static int findSum(int n) { // Let's Suppose n is 5
    //     return n * (n + 1) / 2;
        // Here The Output is 5 * (5+1)/2
        // Here we use Boadmas Theroy divide(/) have first prority 6/2 = 3
        //After Multiplication 5*3 = 15
// }

// 2nd' Algorithm
public static int FindSum(int n){
    int sum = 0; // At the movement the sum is 0;
    for(int i = 1; i<=n; i++){
        sum = sum + 1;
        // Here see How its look 
        // 0 = 0 +1;
        // 1 = 1 + 2;
        // 3 = 3 + 3
        // 6 = 6 + 4
        // 10 = 10 + 5; 
        // 15
    }
    return sum;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = scan.nextInt();
        
        // Call the findSum method and display the result
        int sum = findSum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
        // Close the scanner
        scan.close();
    }
}
