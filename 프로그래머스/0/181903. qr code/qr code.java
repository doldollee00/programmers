class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        char arr[] = code.toCharArray();
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++) {
            if(i % q == r) {
                result.append(arr[i]);
            }
        }        
        return answer = result.toString();
    }
}