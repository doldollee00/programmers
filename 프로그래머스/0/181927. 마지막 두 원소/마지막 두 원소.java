class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};

        int result1 = num_list.length;
        int result2 = num_list[result1 - 1];
        int result3 = num_list[result1 - 2];
        int value;
         
        if (result2 > result3) {
            value = result2 - result3;
        } else {
            value = result2 * 2;   
        }       
        
        answer = new int[result1+1];
        
        for(int i=0; i < result1; i++){
            answer[i] = num_list[i];
        }
        answer[result1] = value;
        
          return answer;
    }
}