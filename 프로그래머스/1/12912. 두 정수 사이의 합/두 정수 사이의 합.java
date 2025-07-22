class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int sum = 0;
        
        if(a>b){
            sum = a;
            a = b;
            b = sum;
        }
        for(int i=a; i<=b; i++){
            answer += i;
        }
        
        return answer;
    }
}