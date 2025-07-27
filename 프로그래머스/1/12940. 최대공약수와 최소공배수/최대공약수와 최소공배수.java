class Solution {
    public int[] solution(int n, int m) {
        int result1 = 0;
        int result2 = 0;
        
        for(int i=n; i>0; i--){
            if(n%i == 0){
                if(m%i == 0){
                    System.out.println("최대공약수" + i);
                    result1 = i;
                    break;
                }
            }
        }
        
        for(int i=1; i<n*m+1; i++){
            if(i%n == 0){
                if(i%m == 0){
                    System.out.println("최소공배수" + i);
                    result2 = i;
                    break;
                }
            }
        }
        int[] answer = {result1, result2};
        return answer;
    }
}