class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int result = 0;
        
        while(n>=a){
            int plus = 0;
            
            if(n % a != 0){
                plus = n % a;
            }
            result = n / a * b;    
            System.out.println("1:"+result+" "+plus);
            n = result + plus;
            answer = answer + result;
            System.out.println("2:"+answer);
        }
        
        return answer;
    }
}