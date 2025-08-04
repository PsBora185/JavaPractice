package dsaPractice.part1.array.easy;

public class rotateOneLeft {

    public static void rotate(int nums[]){

        int temp = nums[0];
        int i ;
        for (i = 0; i < nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[i]=temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
