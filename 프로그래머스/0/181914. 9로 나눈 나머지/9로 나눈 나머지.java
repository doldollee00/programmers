class Solution {
    public int solution(String number) {
        int answer = 0;
        int result = 0;
        
        for(int i=0; i<number.length(); i++) {
            char value = number.charAt(i);
            //System.out.println(value);
            int sum = value - '0';
            //System.out.println(result);
            result += sum;
        } 
        answer = result % 9;
        return answer;
    }
}


