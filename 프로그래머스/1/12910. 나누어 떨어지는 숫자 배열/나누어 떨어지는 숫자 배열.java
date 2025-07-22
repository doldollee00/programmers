import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        //int[] answer = {};
        int[] len = new int[arr.length];
        int j=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                len[j] = arr[i];
                j++;
            }else{}
        } 
        
        int[] answer = new int[j];
            
        for(int n=0; n<answer.length; n++){
            answer[n] = len[n];
        }   
        
        if(j==0){
            answer = new int[]{-1};
        }
        Arrays.sort(answer);
        
        
        return answer;
    }
}