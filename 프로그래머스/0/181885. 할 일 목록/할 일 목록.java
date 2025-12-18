import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        
        List<String> arr = new ArrayList<>();
        
        for(int i=0; i<finished.length; i++) {
            if(finished[i] == false) {
                arr.add(todo_list[i]);
            }
        }
        
        return answer = arr.toArray(new String[0]);
    }
}