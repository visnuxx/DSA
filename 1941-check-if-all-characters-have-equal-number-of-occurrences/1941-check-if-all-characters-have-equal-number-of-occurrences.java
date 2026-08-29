class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }
        int occur = map.get(s.charAt(0));
        for (Integer value : map.values()) {
            if(value!=occur){
                return false;
            }
        }
        return true;
    }
}