class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int res = 0;
        int score = 0;
        int left = 0;
        int right = tokens.length - 1;
        while (left <= right) {
            if (power >= tokens[left]) {
                score++;
                power -= tokens[left];
                left++;
            } else if (score >= 1) {
                score--;
                power += tokens[right];
                right--;
            } else {
                break;
            }
            res = Math.max(score, res);
        }
        return res;
    }
}