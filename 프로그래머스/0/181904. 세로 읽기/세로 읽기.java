class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder sum = new StringBuilder();
        
        char my_string_arr[] = my_string.toCharArray();
    
        for(int i = 1; i <= my_string.length(); i++) {
            if(i%m == c%m) {
                sum.append(my_string_arr[i-1]);
            }
        }
        return answer = sum.toString();
    }
}