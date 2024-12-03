package maximumSubArray;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum = currentSum + num;
            if (currentSum > sum) {
                sum = currentSum;
            }
        }

        return sum;
    }
}
