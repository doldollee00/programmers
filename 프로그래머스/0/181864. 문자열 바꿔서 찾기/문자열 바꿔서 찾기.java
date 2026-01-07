class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String result = myString.replace("A", "C");
        result = result.replace("B", "A");
        result = result.replace("C", "B");
        int index = result.indexOf(pat);
        
        if(index >= 0) {answer = 1;}
        else {answer = 0;}
        return answer;
    }
}

