class Solution {
    public boolean isPalindrome(String s) {
        char[] arr=s.toLowerCase().toCharArray();
        int start=0,end=s.length()-1;
        while(start<end){
            if(arr[start]==arr[end]){
                start++;
                end--;
            }
            else if(!Character.isLetter(arr[start])&&!Character.isDigit(arr[start])){
                start++;
            }
            else if(!Character.isLetter(arr[end])&&!Character.isDigit(arr[end])){
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}