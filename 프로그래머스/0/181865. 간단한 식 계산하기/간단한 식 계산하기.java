class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] result = binomial.split(" ");
        
        
        int a = Integer.parseInt(result[0]);
        String op = result[1];
        int b = Integer.parseInt(result[2]);
        
        if(op.equals("+")) {answer = a + b;}
        else if(op.equals("-")) {answer = a - b;}
        else {answer = a * b;}
        
        return answer;
    }
}