class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int mod = 1000000007;
        long res = 0;
        for (int i = 0; i < arr.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int needed = target - arr[i] - arr[j];
                res += map.getOrDefault(needed, 0);
                res %= mod;
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }

        }
        return (int) res;
    }
}