class Solution {
    int minSwap(int[] arr, int k) {
       // count the total number of elements which are lesser than k
       int countLessK = 0;
       for(int num: arr){
           if(num <= k){
               countLessK++;
           }
       }
       
       // applying sliding window to check the swaps required
       int countMoreK = 0;
       int windowSize = countLessK;
       
       for(int i = 0 ; i < windowSize ;i ++){
           if(arr[i] > k){
               countMoreK ++;
           }
       }
       
       int mini = countMoreK;
       
       for(int i = windowSize ; i < arr.length ; i ++){
           
           
           // check for count more than k
           if(arr[i] > k){
               countMoreK ++;
           }
           
            if(arr[i - windowSize] > k){
                countMoreK --;
            }
            mini = Math.min(mini , countMoreK);
       }
       return mini;
    }
}
