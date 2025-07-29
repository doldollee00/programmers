class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int leng = p.length();
        long num = Long.parseLong(p);
        
        for(int i=0; i<t.length() - leng + 1; i++){
            String result = t.substring(i, i+leng);
            long sub = Long.parseLong(result);
            
            if(sub <= num){
                answer++;
                System.out.println(sub);
            }
        }     
        
        return answer;
    }
}