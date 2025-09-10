class Solution {
    public int minMovesToMakePalindrome(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        int count=0;
        while(i<j){
            if(arr[i]==arr[j]){
                j--;i++;
            }
            else{
                int t=j;
                while(i<t && arr[t]!=arr[i])t--;
                if(i==t){
                    swap(i,i+1,arr);
                    count++;
                }
                else{
                    for(int u=t;u<j;u++){
                    swap(u,u+1,arr);
                    count++;
                    }
                    i++;j--;
                }
            }
        }
        return count;
    }
    public void swap(int i,int j,char[] arr){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }
}