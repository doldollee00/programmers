class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder arr = new StringBuilder();
        for(char c : s.toCharArray()){
            if('A' <= c && c <= 'Z'){
                arr.append((char)('A' + (c - 'A' + n) % 26));
            }else if('a' <= c && c <= 'z'){
                arr.append((char)('a' + (c - 'a' + n) % 26));
            }else{
                arr.append(c);
            }
        }
        
        return answer = arr.toString();
    }
}