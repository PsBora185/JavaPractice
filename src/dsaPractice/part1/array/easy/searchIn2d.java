package dsaPractice.part1.array.easy;

public class searchIn2d {

    public static boolean search(int[][] nums, int n) {

        int r = 0;
        int c = nums[0].length - 1;
        int i = 0;

        while (c >= 0 && r < nums.length) {
            if (n == nums[r][c]) {
                return true;
            } else if (n > nums[r][c] && c == nums[0].length - 1) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 3, 4}, {6, 7, 8}, {11, 13, 14}, {26, 27, 28}};
        int k = 25;
        System.out.println(search(arr, k));
    }
}


