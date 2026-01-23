import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        List<String> result = new ArrayList<>();
        
        for(String line : picture) {
            StringBuilder arr = new StringBuilder();
            
            for(char c : line.toCharArray()) {
                arr.append(String.valueOf(c).repeat(k));
            }
            
            for(int j=0; j<k; j++) {
                result.add(arr.toString());
            }
        }        
        return answer = result.toArray(new String[0]);
    }
}