//link---->https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
/*Input: 
n = 3 
w = 50
value[] = {60,100,120}
weight[] = {10,20,30}
Output:
240.000000*/
//T.C--->O(nlogn) + O(n)


class Solution {
    // Function to get the maximum total value in the knapsack.
    class comparatorItem implements Comparator<Item>{
        public int compare(Item a,Item b){
            double r1 = (double)(a.value) / (double)(a.weight);
            double r2 = (double)(b.value) / (double)(b.weight);
            if(r1 < r2){
                return 1;
            }
            else if(r1 > r2){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        Arrays.sort(arr,new comparatorItem());
        int curWeight =0;
        double finalValue = 0.0;
        
        for(int i =0;i < n;i++){
            if(curWeight + arr[i].weight <= w){
                curWeight += arr[i].weight;
                finalValue += arr[i].value;
            }
            
            else{
                int remain = w - curWeight;
                finalValue += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;
                break;
            }
        }
        return finalValue;
    }
}
