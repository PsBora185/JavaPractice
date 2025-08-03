package dsaPractice.part1.array.easy;
import java.util.Scanner;

public class secondMax {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the length : ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.print("Enter the elements in array : "); 
       
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();   // takimg elements 
        }

        int max , max2;

        if (arr[0] > arr[1]) {
            max = arr[0];
            max2 = arr[1];
        }
        else{
            max = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > max) {  // comparing elements with max if its greater
                max2 = max;
                max = arr[i];
            }
            else if ( arr[i] > max2) { // comparing elements with second max if its greater
                max2 = arr[i];
            }
        }
        System.out.println("Second Largest element is : "+max2);
        
    }
}
