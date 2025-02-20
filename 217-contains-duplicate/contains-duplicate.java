class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> digits= new HashSet<>();

        for (int num : nums) {
            if (digits.contains(num)) {
                return true;
            }
            digits.add(num);
        }
        return false;
    }
}