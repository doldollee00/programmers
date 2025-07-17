class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int i = my_string.length();
        int j = i - n;
        
        answer = my_string.substring(j, i);
             
        return answer;
    }
}