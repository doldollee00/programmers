class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                //System.out.println("김서방은 "+ i +"에 있다");
                answer = "김서방은 "+ i +"에 있다";
            }else{}
        }
        return answer;
    }
}