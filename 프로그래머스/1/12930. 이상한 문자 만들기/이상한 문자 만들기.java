class Solution {
    public String solution(String s) {
        String answer = "";
        int input = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == ' '){
                sb.append(ch);
                input = 0;
            }else{
                if(input%2 == 0){
                    sb.append(Character.toUpperCase(ch));
                }else{
                    sb.append(Character.toLowerCase(ch));
                }
            input++;
            }
        }
        return answer = sb.toString();
    }
}