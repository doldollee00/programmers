import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        
        List<String> arr = new ArrayList<>();
        
        for(int i = 0; i< names.length;) {
            arr.add(names[i]);
            i += 5;
        }
        
        return answer = arr.toArray(new String[0]);
    }
}