import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];        
        
        for(int i = 0; i<commands.length; i++){
            int a = commands[i][0] -1;
            int b = commands[i][1];
            int c = commands[i][2] -1;
            
            int[] temp = new int[b-a];
            for(int j=0; j<temp.length; j++){
                temp[j] = array[a+j];
            }
            
            Arrays.sort(temp);
            
            answer[i] = temp[c];
        }
        
        return answer;
    }
}