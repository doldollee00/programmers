class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        char my_string_arr[] = my_string.toCharArray();
        char is_prefix_arr[] = is_prefix.toCharArray();
        int bodyLast = my_string.length() - 1;
        int tailLast = is_prefix.length() - 1; 
        
        if(tailLast > bodyLast) {
            return answer;
        }
        
        for(int i = 0; i <= tailLast; i++) {
            if (is_prefix_arr[i] == my_string_arr[i]) {
            } else {
                return answer;
            }
        }
        
        return answer = 1;
    }
}