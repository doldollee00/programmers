import java.util.*; 

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
    
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<num_list.length;) {
            arr.add(num_list[i]);
            i += n;
        }       
        
        return answer = arr.stream().mapToInt(Integer::intValue).toArray();
    }
}