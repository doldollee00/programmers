class Solution {
    public String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase();
        answer = answer.replace("a", "a".toUpperCase());
        return answer;
    }
}