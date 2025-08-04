import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            result.add(score[i]);
            result.sort(Collections.reverseOrder());
     
            //System.out.println(result);
        
            if(result.size() > k){
                result = result.subList(0,k);
                //System.out.println("hi" + result);
            }
            answer[i] = result.get(result.size() - 1);
        }
        return answer;
    }
}