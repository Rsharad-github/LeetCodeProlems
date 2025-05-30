class Q29SubArraySumK {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        // Build prefix sum array
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Try all subarrays using prefix sums
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (prefix[j] - prefix[i] == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
