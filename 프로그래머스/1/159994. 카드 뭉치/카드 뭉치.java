class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int i = 0;
        int j = 0;
        
        for(String result : goal) {
            if(i < cards1.length && cards1[i].equals(result)) {
                i++;
            } else if(j < cards2.length && cards2[j].equals(result)) {
                j++;
            } else {
                return "No";
            }
        }
        answer =  "Yes";
        return answer;
    }
}