class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        char my_string_arr[] = my_string.toCharArray();
        char is_suffix_arr[] = is_suffix.toCharArray();
        int bodyLast = my_string.length() - 1;
        int tailLast = is_suffix.length() - 1;
        int count = 0;
            
        if (tailLast > bodyLast) {
            return answer;        
        }
        
        for(int i = tailLast; i >= 0; i--) {
            if(is_suffix_arr[i] == my_string_arr[bodyLast]) {
                bodyLast = bodyLast - 1;
            } else {
                return answer;
            }
        }
        return answer = 1;
    }
}