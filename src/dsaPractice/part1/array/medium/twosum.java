package dsaPractice.part1.array.medium;

import java.util.HashMap;
import java.util.HashSet;

public class twosum {

    public static void find(int[] nums, int sum) {  // max n*(n-1)/2 -> O(n^2)

        for (int i = 0; i < nums.length; i++) {
            int n = sum - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println(i + " " + j);
                if (nums[j] == n) {
                    System.out.println(nums[i] + " " + nums[j]);
                    return;
                }
            }
            System.out.println();
        }
        System.out.println("no match");
    }

    public static void ts(int[] nums, int sum) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = sum - nums[i];

            if (h.containsKey(diff)) {
                System.out.println(h.get(diff) + " , " + i);
                return;
            }

            h.put(nums[i], i);
        }

        System.out.println("no match");
    }

    public static void print(int[] nums) {
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 8, 9};
        print(arr);
        ts(arr, 17);
    }
}
