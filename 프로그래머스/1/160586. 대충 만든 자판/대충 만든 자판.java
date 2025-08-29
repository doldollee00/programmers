class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
         

        for(int i=0; i<targets.length; i++) {
            String target = targets[i];
            int sum = 0;
            
            for(char arr : target.toCharArray()) {
                int min = Integer.MAX_VALUE;             
                
                for(String key : keymap) {
                    int index = key.indexOf(arr); 
                    
                    if( index >= 0 && min > index+1) {
                        min = index+1;
                    }
                }
                
                if(min == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                } else {
                    sum+=min;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}