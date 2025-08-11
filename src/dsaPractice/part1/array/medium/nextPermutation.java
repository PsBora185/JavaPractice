package dsaPractice.part1.array.medium;

public class nextPermutation {

    public static void find(int[] nums) {

        int i = nums.length - 2;

        // reach where the change is needed
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) { // if i < 0 means all nums are in descending , no greater permutation

            int j = nums.length - 1;
            int temp = nums[i];

            // after i all are in descending order , so loop breaks when j is at > element of i
            while (j > i + 1 && nums[j] <= nums[i])
                j--;
            // swap
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // reverse subarray from i+1 to n-1
        int st = i + 1;
        int end = nums.length - 1;

        while (st < end) {
            int temp = nums[st];
            nums[st++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void print(int[] nums) {
        for (Integer n : nums)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,1,1};

        find(arr);

        print(arr);
    }
}
