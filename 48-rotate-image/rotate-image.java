class Solution {
        public void rotate(int[][] matrix) {
            for(int i=0;i<matrix.length;i++){
                    for(int j=i+1;j<matrix[i].length;j++){
                        int temp=matrix[i][j];
                        matrix[i][j]=matrix[j][i];
                        matrix[j][i]=temp;
                    }
            }
            for(int arr[]:matrix){
                reverseRow(arr);
            }
        }
        public void reverseRow(int[] arr){
            int start=0,end=arr.length-1;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                ++start;--end;
            }
        }
}