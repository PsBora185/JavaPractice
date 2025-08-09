package dsaPractice.part1.array.medium;

public class SubarrayWithMaxSum {

    public static void findSubarray(int[] nums) {

        int maxSum = nums[0];
        int st = 0, end = 0, sum = 0;

        for (int i = 0; i < nums.length; i++) { // moving on to each subarray , keeping track of indexes and max sum
            sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum > maxSum) {
                    st = i;
                    end = j;
                    maxSum = sum;
                }
            }
        }

        for (int i = st; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void find(int[] nums) {

        int tst = 0, st = 0, end = 0;
        int sum = nums[0], maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            // keep track of current sum
            if (sum + nums[i] < 0){ // when current sum is in minus no point in taking it for subarray , it will reduce value
                sum = 0;  // so make it 0 , we will take subarray with +ve sum
                tst = i+1; // and keeping the starting idx for that new subarray
            } else
                sum += nums[i];

            if (maxSum < sum){  // when current sum is greater than max sum
                maxSum = sum; // make it  new max sum
                st =  tst; // now we will take the starting idx of new subarray cuz its sum is max
                end = i; // end will update if we are taking more element in contiguous subarray
            }
        }

        System.out.println("Maximum sum is : "+maxSum);
        for (int i = st; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {-1 , 2, 1, -4, 3, -1, 2, -1 , 3};
        findSubarray(arr);
    }
}
