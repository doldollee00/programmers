class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long a = 0;
        System.out.println(answer.length);
        
        for(int i=0; i<n; i++){
            a += x;
            answer[i] = a;
            //answer[i] = (long)x * (i+1);
        }
        return answer;
    }
}