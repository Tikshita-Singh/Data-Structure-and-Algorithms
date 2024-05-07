//link====>https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
//T.C---> 0(NlogN) + O(N*M)

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a, b) -> (b.profit - a.profit));
        
        int maxi =0;
        for(int i =0;i < n;i++){
            if(arr[i].deadline > maxi){
                maxi = arr[i].deadline;
            }
        }
        int[] result = new int[maxi+1];
        for(int i =1;i <= maxi;i++){
            result[i] =-1;
        }
        
        int countJob =0;
        int profitJob =0;
        
        for(int i= 0;i<n;i++){
            for(int j = arr[i].deadline;j >0;j--){
                // check free slot
                if(result[j] == -1){
                    result[j] =i;
                    countJob++;
                    profitJob += arr[i].profit;
                    break;
                }
            }
        }
        int ans[] = new int[2];
        ans[0] = countJob;
        ans[1] = profitJob;
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
