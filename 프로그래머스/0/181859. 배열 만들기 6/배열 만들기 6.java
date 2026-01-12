import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> stk = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
            } else {
                int last = stk.size() - 1;
                if(stk.get(last) == arr[i]) {
                    stk.remove(last);
                } else {
                    stk.add(arr[i]);
                }
            }
        }
        if(stk.size() <= 0) {
            stk.add(-1);
        }
        
        return answer = stk.stream().mapToInt(Integer::intValue).toArray();
    }
}