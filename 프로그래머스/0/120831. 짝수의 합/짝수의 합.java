class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
           if(i%2==0) {
               System.out.println("짝수 입니다");
               answer += i;
           }else{
               System.out.println("홀수 입니다");
           }
        }
        return answer;
    }
}