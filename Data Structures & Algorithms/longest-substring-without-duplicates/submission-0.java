class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxlen = 0;
        char[] c = s.toCharArray();
        int j=0;
        for(int i=0;i<c.length;i++ ){
            while(set.contains(c[i])){
                set.remove(c[j++]);
            }
            set.add(c[i]);
            maxlen = Math.max(set.size(),maxlen);
        }
        return maxlen;
    }
}
