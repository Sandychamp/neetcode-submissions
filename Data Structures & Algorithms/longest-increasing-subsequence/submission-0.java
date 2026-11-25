class Solution {
    private int[] memo;

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        memo = new int[n];
        Arrays.fill(memo,-1);

        int maxLis = 1;
        for(int i = 0 ; i < n ; i++){
            maxLis = Math.max(maxLis , dfs(nums,i));
        }
        return maxLis;
    }

    private int dfs(int[] nums , int i){
        if(memo[i] != -1){
            return memo[i];
        }

        int Lis = 1;
        for(int j = i+1 ; j < nums.length ; j++){
           if(nums[i] < nums[j]){
            Lis = Math.max(Lis, 1 + dfs(nums,j));
           }
        }
        memo[i] = Lis;
        return Lis;
    }
}
