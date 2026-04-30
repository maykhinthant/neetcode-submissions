class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Streams and distinct
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}