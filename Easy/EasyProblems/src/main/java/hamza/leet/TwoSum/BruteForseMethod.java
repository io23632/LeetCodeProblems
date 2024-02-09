package hamza.leet.TwoSum;

public class BruteForseMethod {
    public int [] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j] && nums[j] == target - nums[i]) {
                    return new int [] {i, j};
                }
            }
        }
        return null;
    }
}
