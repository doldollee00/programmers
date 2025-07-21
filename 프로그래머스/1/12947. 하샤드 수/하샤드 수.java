class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        char[] arr = Integer.toString(x).toCharArray();
        
        for(char c : arr){
            sum += c -'0';
        }
        if(x%sum==0){
            System.out.println("하샤드 수");
            answer=true;
        }else{
            System.out.println("아님");
            answer=false;
        }
        return answer;
    }
}