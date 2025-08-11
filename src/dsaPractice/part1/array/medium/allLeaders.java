package dsaPractice.part1.array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class allLeaders {

    public static List<Integer> find(int[] nums){

        List<Integer> leaders = new ArrayList<>();
        int n = 0;
        leaders.add(nums[nums.length-1]);

        for (int i = nums.length-2; i >= 0; i--) {

            if (nums[i] >= leaders.get(n)) {
                leaders.add(nums[i]);
                n++;
            }

        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void print(int[] nums) {
        for (Integer n : nums)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};

        List<Integer> leaders = find(arr);

        for (int num : leaders)
            System.out.print(num+" ");
    }
}
