package dsaPractice.part1.array.easy;

public class missing {

    public static int find(int nums[]){
// brute force , O(n^2)
//        for (int i = 0; i < nums.length; i++) {
//            int j = 0;
//            while (j < nums.length){
//                if (i == nums[j]){
//                    break;
//                }else {
//                    j++;
//                }
//            }
//            if (j == nums.length){
//                return i;
//            }
//        }
//        return -1;

        int n = nums.length;
        int esum = n*(n+1)/2;  // sum of 0 to n numbers
        int asum = 0;

        for (int num : nums) {
            asum += num;
        }
        return esum-asum;
    }

    public static void print(int[] nums) {
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,3,1,4,5};
        System.out.println(find(arr));
    }
}
