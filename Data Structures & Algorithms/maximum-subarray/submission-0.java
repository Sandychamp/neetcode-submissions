class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0] , curSum = 0;

        for(int i = 0 ; i < n ; i++){
             if(curSum < 0){
                curSum = 0;
             }
             curSum += nums[i];
             sum = Math.max(sum,curSum);
        }
        return sum;
    }
}
