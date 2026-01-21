import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    count++;
                }
            }
            if(count < 1) {
                result.add(arr[i]);
            } 
        }
        return answer = result.stream().mapToInt(Integer::intValue).toArray();
    }
}