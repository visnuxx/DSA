class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i + 1; j++) {
                int leftDiff = Math.abs(x - arr[j - 1]);
                int rightDiff = Math.abs(x - arr[j]);
                if (leftDiff > rightDiff ||
                        (leftDiff == rightDiff && arr[j - 1] > arr[j])) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            list.add(arr[i]);
        }

        Collections.sort(list);

        return list;
    }
}