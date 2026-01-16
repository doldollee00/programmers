import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        
        int leng = arr.length;
        
        if(leng % 2 != 0) {
            for(int i=0; i<leng; i++) {
                if(i % 2 == 0) {
                    result.add(arr[i] + n);
                } else {
                    result.add(arr[i]);
                }
            }
        } else {
            for(int i=0; i<leng; i++) {
                if(i % 2 != 0) {
                    result.add(arr[i] + n);
                } else {
                    result.add(arr[i]);
                }
            }
        }
        return answer = result.stream().mapToInt(Integer::intValue).toArray();
    }
}