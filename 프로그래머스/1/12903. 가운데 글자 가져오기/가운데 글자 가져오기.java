class Solution {
    public String solution(String s) {
        String answer = "";
        int i = s.length();
        //System.out.println(i);
        int j = i/2;
        
        if(i%2!=0){
            answer = s.substring(j, j+1);
        }else{
            answer = s.substring(j-1, j+1);
        }
    
        return answer;
    }
}