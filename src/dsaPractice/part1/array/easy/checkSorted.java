package dsaPractice.part1.array.easy;

public class checkSorted {

    public static boolean isSorted(int nums[]){

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,5};
//        System.out.println(isSorted(arr));
    }
}
