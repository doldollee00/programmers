class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        char my_string_arr[] = my_string.toCharArray();
        
        for(int i=s; i<e; i++) {
            if (i < e) {
                char save = my_string_arr[i];
                my_string_arr[i] = my_string_arr[e];
                my_string_arr[e] = save;
                e = e-1;
            } else {}
        }
        return answer = new String(my_string_arr);
    }
}