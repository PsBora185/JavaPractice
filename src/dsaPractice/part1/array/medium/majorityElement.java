package dsaPractice.part1.array.medium;

public class majorityElement {

    public static int findElement(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int crnt = nums[i];

            for (int j = i + 1; j < n; j++) {
                if (count + n - j - 1 < n / 2)
                    break;
                if (crnt == nums[j])
                    count++;
                if (count >= n / 2)
                    return crnt;
            }
        }
        return -1;
    }  // O(n^2)

    public static int getElement(int[] nums) {  // boyer moore majority vote algo

        int count = 0;
        int ele = 0;

        for (int n : nums) {  // we check count for element if it's more than others
            if (count == 0) // no element is more than n/2 then pick current
                ele = n;

            count += (ele == n) ? 1 : -1;  // if n == element then c++ else c--
        }

        for (int n : nums)
            if (n == ele) count++; // checks how many times , > n/2 or not

        return (count >= nums.length / 2) ? ele : -1;
    }  // O(n)+O(n) = O(2n) -> O(n)


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 4, 1, 5};

        System.out.println(getElement(arr));
    }
}
