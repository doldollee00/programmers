import java.util.*;

class Solution {    public String[] solution(String my_string) {
        String[] answer = {};
        
        String[] result = my_string.split("");
        
        for(int i=0; i<my_string.length(); i++){
            result[i] = my_string.substring(i);
        }
        Arrays.sort(result);
        return answer = result;
    }
}