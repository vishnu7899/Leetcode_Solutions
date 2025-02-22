class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int[] customer: accounts){
            int eachCustomerWealth = 0;

            for(int bank : customer){
                eachCustomerWealth+=bank;
            }
            maxWealth = Math.max(maxWealth, eachCustomerWealth);
        }
        return maxWealth;
    }
}