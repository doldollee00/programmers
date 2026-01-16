import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(num_list);
        for(int i=0; i<5; i++) {
            result.add(num_list[i]);
        }
        
        return answer = result.stream().mapToInt(Integer::intValue).toArray();
    }
}