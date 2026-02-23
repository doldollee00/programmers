class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] a = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++) {
            String temp = babbling[i];
            
            for(int j=0; j<a.length; j++) {
                if(temp.contains(a[j] + a[j])) {
                    temp = "X";
                    break;
                }
                temp = temp.replace(a[j], " ");
            }
            
            if(temp.trim().isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}