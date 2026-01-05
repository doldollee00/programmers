class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int count = 0;
        
        for(int i=0; i<num_list.length; i++) {
            int ran = num_list[i];
            
            while (true) {
                if(ran == 1) {
                    break;
                }
                if(ran % 2 == 0) {
                    ran = ran / 2;
                    count++;
                } else {
                    ran = (ran - 1) / 2;
                    count++;
                } 
            }
        }
        return answer = count;
    }
}