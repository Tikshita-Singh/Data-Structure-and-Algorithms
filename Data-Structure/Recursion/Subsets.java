// https://leetcode.com/problems/subsets/submissions/1266632393/?envType=daily-question&envId=2024-05-21

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        solve(nums,0,temp,result);
        return result;
    }
    public void solve(int[] nums,int idx,List<Integer> temp,List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        solve(nums,idx+1,temp,result);
        temp.remove(temp.size()-1);
        solve(nums,idx+1,temp,result);
    }
}
