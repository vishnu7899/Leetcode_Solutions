class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
       for(int num:nums)
       {
            res^=num;  //Bit manipulation  
       }
       /*res = 0 ^ 2 -> res = 2

        res = 2 ^ 3 -> res = 1

        res = 1 ^ 2 -> res = 3

        res = 3 ^ 4 -> res = 7

        res = 7 ^ 3 -> res = 4 */

       return res;
    }
}