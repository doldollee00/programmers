class Solution {
    public int solution(int num) {
        int answer = 0;
        int i = 0;
        
        if(num == 1){answer = 0;}
        else{
            while(num != 1){
                if(i>500){
                    break;
                }
                else if(num%2 == 0){
                    num = num / 2;
                    i++;
                }else{
                    num = num * 3 + 1;
                    i++;
                }
            } 
            if(i<400) answer = i;
            else answer = -1;
        }
        return answer;
    }
}