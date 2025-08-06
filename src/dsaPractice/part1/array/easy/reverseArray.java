package dsaPractice.part1.array.easy;


public class reverseArray {

    public static void print(int nums[]){
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void reverse(int nums[]){

        int temp;

        for (int i = 0; i < nums.length/2; i++) {  // O(n/2)
           temp= nums[i];
           nums[i] = nums[nums.length-i-1];
           nums[nums.length-i-1] = temp;
        }
    }
        public static void main(String[] args) {
        
            int arr[] = {1,2,3,4};
            print(arr);
            reverse(arr);
            print(arr);
        
    }
}
