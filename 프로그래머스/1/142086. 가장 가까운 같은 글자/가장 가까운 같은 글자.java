import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastPos = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (lastPos.containsKey(ch)) {
                answer[i] = i - lastPos.get(ch);
            } else {
                answer[i] = -1;
            }
            lastPos.put(ch, i);
        }
        return answer;
    }
}