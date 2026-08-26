class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer value : map.values()) {
            if (value == 1) {
                return -1;
            }
            res += (value + 2) / 3;

        }
        return res;
    }
}