import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        int sum = 0;
        
        for(int i=0; i<flag.length; i++) {
            if(flag[i] == true) {
                int ex = arr[i] * 2;
                sum = ex;
                for(int j=0; j<ex; j++) {
                    answer.add(arr[i]);
                }
            } else {
                for(int j=0; j<arr[i]; j++) {
                    answer.remove(answer.size()-1);
                }
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}