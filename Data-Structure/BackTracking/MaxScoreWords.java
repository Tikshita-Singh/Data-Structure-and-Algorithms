// https://leetcode.com/problems/maximum-score-words-formed-by-letters/?envType=daily-question&envId=2024-05-24
//T.C : O(2^n) where n is the total number of words
//S.C : O(n)

class Solution {
    int n;
    int maxi;

    public void solve(int i,String[] words,int[] freq,int[] score,int curr){
        maxi = Math.max(maxi,curr);
        if(i >=n){
            return;
        }
        int[] tempfreq = Arrays.copyOf(freq,freq.length);
        int j =0;
        int temp = 0;

        while(j < words[i].length()){
            char ch = words[i].charAt(j);
            tempfreq[ch - 'a']--;
            temp += score[ch - 'a'];

            if(tempfreq[ch - 'a'] < 0){
                break;
            }
            j++;
        }

        if(j == words[i].length()){
            solve(i+1,words,tempfreq,score,curr+temp);
        }
        solve(i+1,words,freq,score,curr);
    }

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];
        for(char ch:letters){
            freq[ch -'a']++;
        }
        maxi = Integer.MIN_VALUE;
        n = words.length;
        solve(0,words,freq,score,0);
        return maxi;
    }
}
