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

    public static void  r(int[] nums){

        int t = 0, s = 1;  // 0 for +ve 1 for -ve
        int c = 0;

        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] < 0 && s == 1) ||  (nums[i] >= 0 && s == 0)){ // when we encounter the needed sign element for the position
                int a = t; // at t we have to place element of i
                while (a < i) {  // place the element in position and move the elements one idx forward
                    int temp = nums[t];
                    nums[t] = nums[++a]; // takes next element , also takes i
                    nums[a] = temp;
                } // swap elements at a with pos t ; it will move elements at t , in next swap move element to next of its original pos
            } // 1 2 3 4 : swap 1 & 2 -> 2 1 3 4 : 2 & 3 -> 3 1 2 4 : 3 & 4 : 4 1 2 3 : subarray is rotated right by 1

            while (t < nums.length && !((t % 2 == 0 && nums[t] < 0) || (t % 2 != 0 && nums[t] >= 0))){
                t++;
            } // check for right positioning and move t : if t is even with +ve or t is odd with -ve , then all good check next

            // decide which element is needed for position t
            if (t < nums.length && t % 2 == 0 && nums[t] < 0){ // t is even but value -ve then find +ve
                s = 0;
            } else if (t < nums.length && t % 2 != 0 && nums[t] >= 0) { // t is odd but value +ve then find -ve
                s=1;
            }
        }
    }

    public static void print(int[] nums){
        for (Integer n : nums)
            System.out.print(n + " ");
        System.out.println();

    }


    public static void main(String[] args) {

        int[] arr = {-1,1,-2,2,-3,3};

        r(arr);
        print(arr);
    }
}
