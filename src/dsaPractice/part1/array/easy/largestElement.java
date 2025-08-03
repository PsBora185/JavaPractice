package dsaPractice.part1.array.easy;
import java.util.*;

public class largestElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the length : ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.print("Enter the elements in array : "); 
       
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();   // taking elements 
        }

        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {  // comparing elements one by one 
                largest = arr[i];
            }
        }
        System.out.println("Largest element is : "+largest);
    }
}
