class Solution {
    public static void Solve(int i , int[] nums ,  List<List<Integer>> ans , List<Integer> curr)
    {
        if(i == nums.length)
        {
            ans.add(new ArrayList<>(curr)) ;
            return ;
        }
        curr.add(nums[i]) ;
        Solve(i+1,nums,ans,curr) ;
        curr.remove(curr.size()-1) ;
        Solve(i+1,nums,ans,curr) ;
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList() ;
        Solve(0,nums,ans,new ArrayList<Integer>()) ;
        return ans ;
    }
}