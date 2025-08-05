package dsaPractice.part1.array.easy;

public class linearSearch {

    public static int lSearch(int[] nums, int n){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,6,3,4,2};
        System.out.println("number found at index : "+lSearch(arr,7));
    }
}
