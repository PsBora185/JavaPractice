package dsaPractice.part1.array.easy;

public class removeDuplicates {

    public static int removeO(int nums[]){  // optimised : gives unique count & update the array in unique order
        int unique=0;

        for (int i = 1; i < nums.length-1; i++) {
            if (nums[unique] != nums[i]) {
                unique++;
                nums[unique]=nums[i];
            }
        }
        return unique;
    }

    public static int remove(int nums[]) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i;
            while ((i + 1) < nums.length && nums[j] == nums[i + 1]) {
                i++;
            }
            count++;
            if ((i + 1) < nums.length ){
                nums[count] = nums[i + 1];
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = {-2,2,4,4,4,4,5,5};

        int u = remove(arr);
        System.out.println("number of unique elements : " + u);
        for (int i = 0; i < u; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
