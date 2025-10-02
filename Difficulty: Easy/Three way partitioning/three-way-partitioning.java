class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int n = arr.length;
        
        int start = 0 , end = n-1;
        
        for(int i = 0 ; i <= end ;){
            
            if(arr[i] < a){
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
                i++;
            }
            
            else if(arr[i] > b){
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
            
            else{
                i++;
            }
        }
    }
}