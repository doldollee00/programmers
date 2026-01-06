import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        
        String[] result = myString.split("x", -1);
        for(int i=0; i<result.length; i++) {
            answer.add(result[i].length());
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}