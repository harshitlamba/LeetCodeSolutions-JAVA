public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        int start, sum_, flag_once;
        start = sum_ = flag_once = 0;
        int end = k - 1;
        double maxAvg = -99999;

        while (end < nums.length) {
            if (flag_once!=1) {
                int m = start;
                while (m <= end) {
                    sum_ += nums[m];
                    m++;
                }
                end++;
                flag_once = 1;
            } else {
                start++;
                sum_ -= nums[start-1];
                sum_ += nums[end];
                end++;
            }
            if ((double) sum_/k > maxAvg) {
                maxAvg = (double) sum_/k;
            }
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
        System.out.println(findMaxAverage(new int[]{5},1));
        System.out.println(findMaxAverage(new int[]{6,6},1));
        System.out.println(findMaxAverage(new int[]{6,6},2));
        System.out.println(findMaxAverage(new int[]{-100},1));
    }
}
