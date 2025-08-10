package dsaPractice.part1.array.medium;

public class RearrangeBySign {

    public static int[] rearrange(int[] nums) {

       int[] arr = new int[nums.length];
       int pos = 0 , neg = 1; // positions of first +ve & -ve

       for (int i = 0; i < nums.length; i++) {
           if (nums[i] < 0) {
               arr[neg] = nums[i];
               neg += 2;
           }
           else {
               arr[pos] = nums[i];
               pos += 2;
           }
       }

       return arr;
    }


    public static void print(int[] nums){
        for (Integer n : nums)
            System.out.print(n + " ");
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {-1,1,-2,2,-3,3};

        print(rearrange(arr));
    }
}
