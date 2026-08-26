class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
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