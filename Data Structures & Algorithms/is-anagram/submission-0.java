class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. toCharArray for both strings
        // 2. Sort the arrays
        // 3. Compare 2 arrays. If the same --> true. Otherwise --> false
        
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}
