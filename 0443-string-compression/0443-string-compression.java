class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while (read < chars.length) {
            char current = chars[read];
            int count = 0;
            while (read < chars.length && current == chars[read]) {
                read++;
                count++;
            }
            chars[write++]=current;
            if (count > 1) {
                String num = String.valueOf(count);
                for (int i = 0; i < num.length(); i++) {
                    chars[write] = num.charAt(i);
                    write++;
                }
            }

        }
        return write;
    }
}