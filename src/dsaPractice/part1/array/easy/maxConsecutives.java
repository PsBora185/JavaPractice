package dsaPractice.part1.array.easy;

public class maxConsecutives {

    public static int mco(int[] nums) {
        int count = 0, m = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                m = Math.max(count, m);
            } else {
                count = 0;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 1, 1, 0};

        System.out.println(mco(arr));
    }
}
