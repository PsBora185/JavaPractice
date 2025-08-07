package dsaPractice.part1.array.easy;

public class longestSub {

    public static int sub(int[] nums, int k) {
        int length = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k)
                    length = Math.max((j - i + 1), length);

                if (sum > k)
                    break;
            }
        }
        return length;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 9, 4};
        int k = 15;

        System.out.println(sub(arr, k));
    }
}
