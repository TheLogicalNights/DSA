package productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {

    public int[] productOfArray(int[] nums) {
        int result[] = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        for (int i = 1, j = nums.length - 2; i < nums.length && j >= 0; i++, j--) {
            left[i] = left[i - 1] * nums[i - 1];
            right[j] = right[j + 1] * nums[j + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
