class Solution {
    public String[] solution(String[] strArr) {
        int arr = strArr.length;
        String[] answer = new String[arr];
        int a = 0;
        
        for(int i=0; i<arr; i++) {
            if(a==0) {
                answer[i] = strArr[i].toLowerCase();
                a = 1;
            } else {
                answer[i] = strArr[i].toUpperCase();
                a = 0;
            }
        }
        
        return answer;
    }
}