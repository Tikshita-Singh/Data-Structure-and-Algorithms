//https://leetcode.com/problems/palindrome-partitioning/?envType=daily-question&envId=2024-05-22

class Solution {
    public List<List<String>> partition(String s) {
        List<String> curr = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        backtrack(s,0,curr,result);
        return result;
    }
    public void backtrack(String s,int idx,List<String> curr,List<List<String>> result){
        if(idx == s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx;i < s.length();i++){
            if(isPallindrome(s,idx,i)){
                curr.add(s.substring(idx,i+1));
                backtrack(s,i+1,curr,result);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPallindrome(String s,int l,int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
