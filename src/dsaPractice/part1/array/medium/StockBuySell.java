package dsaPractice.part1.array.medium;

public class StockBuySell {

    public static int find(int[] nums) {

        int buy = 0, sell = 0, minDay = 0;  // b keeps track of the day when prize is less than our current buy day
        int maxProfit = 0;


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < nums[minDay])
                minDay = i;

            int profit = nums[i] - nums[minDay];

            if (profit > maxProfit) {
                maxProfit = profit;
                buy = minDay;
                sell = i;
            }
        }

        System.out.println("Nuy on day : " + buy + "\nSell on : " + sell);
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr = {5, 8, 11, 3, 6, 8, 4, 7, 13, 2, 10}; // {10, 7, 5, 8, 11, 9};
        System.out.println(find(arr));
    }
}
