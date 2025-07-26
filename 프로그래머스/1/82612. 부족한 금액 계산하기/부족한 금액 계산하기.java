class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for(int i=1; i<count+1; i++){
            sum += (price * i);
        }
        //System.out.println(sum);
        
        if(money-sum>0){
            answer = 0;
        }else{
            answer = (sum - money);
            System.out.println(answer);
        }
        
        return answer;
    }
}