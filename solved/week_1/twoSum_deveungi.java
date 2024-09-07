public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int r = target - nums[i];
            if (map.containsKey(r)) {
                return new int[] {map.get(r), i };
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
