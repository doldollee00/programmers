class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int arr = num_list.length;
        
        if(arr > 10) {
            for(int i=0; i<arr; i++) {
                answer += num_list[i];
            }
        } else {
            int result = 1;
            
            for(int i=0; i<arr; i++) {
                result *= num_list[i];
            }
            answer = result;
        }
        
        return answer;
    }
}