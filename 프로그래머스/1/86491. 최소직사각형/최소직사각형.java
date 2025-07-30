class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] arr = new int[sizes.length][sizes[0].length];
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                arr[i][0] = sizes[i][0];
                arr[i][1] = sizes[i][1];
            }else{
                arr[i][1] = sizes[i][0];
                arr[i][0] = sizes[i][1];
            }
        }
        int result1 = arr[0][0];
        int result2 = arr[0][1];
        
        for(int i=1; i<arr.length; i++){
            if(arr[i][0] > result1){
                result1 = arr[i][0];
            }else{}
            if(arr[i][1] > result2){
                result2 = arr[i][1];
            }else{}
        }
        answer = result1 * result2;
        return answer;
    }
}