class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        String[] noArr = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(int i = 0; i < babbling.length; i++) {
            for(String not : noArr) {
                if(babbling[i].contains(not)){
                    babbling[i] += "1";
                }
            }
            for(int j = 0; j < arr.length; j++) {
                babbling[i] = babbling[i].replace(arr[j], "0");
            }
        }
        
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("0", "");
            if (babbling[i].equals("")) answer++;
        }
        
        return answer;
    }
}