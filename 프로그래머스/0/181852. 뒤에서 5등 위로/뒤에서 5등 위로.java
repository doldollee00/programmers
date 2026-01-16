import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int arr = num_list.length;
        
        Arrays.sort(num_list);
        return answer = Arrays.copyOfRange(num_list, 5, arr);
    }
}