package dsaPractice.part1.array.medium;

public class sortZeroOneTwo {

    public static void zotSort(int[] nums) {

        int i, n = 0, j = 0;

        while (n < 2) {  // using n we will sort one by one , first all 0 from start then all 1 after that all 2 will be at last no need for replacing
            for (i = j; i < nums.length; i++) {
                if (nums[j] == n) // if current replace index element is 0 or 1 no need to replace its good so move forward we will be at diff number then n
                    j++;

                if (nums[i] == n && j < i) { // if encounter n (0 or 1) then replace
                    int temp = nums[j];
                    nums[j] = n;
                    nums[i] = temp;
                }
            }
            // move next cuz till now all replaced in order (0 or 1)
            j++;
            n++;
        }
    }

    public static void sortByDutchNFlagAlgo(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;
// low for 0s & high for 2s , 1s will come at place after 0 & 2 go to front and back

        while (mid <= high) {
            switch (nums[mid]) {
                case 0: // move 0 to front where next 0 should be , move to next place for 0 & next num to check
                    int temp0 = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp0;
                    low++;
                    mid++;
                    break;
                case 1: // if its 1 it is after 0 so good and 2s are moved at back so just move to next element
                    mid++;
                    break;
                case 2: // when 2 so move to back then come one index backward , no moving mid cuz there will be 0 1 or 2 that needs to be moved
                    int temp2 = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp2;
                    high--;
            }
        }
    }

    public static void print(int[] nums) {
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 2, 0};

        print(arr);
        sortByDutchNFlagAlgo(arr);
        print(arr);
    }
}
