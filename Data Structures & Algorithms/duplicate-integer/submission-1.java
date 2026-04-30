class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Streams and distinct and count. O(n)
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}