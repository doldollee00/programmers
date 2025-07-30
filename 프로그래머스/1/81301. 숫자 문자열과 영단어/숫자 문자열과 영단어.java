class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        StringBuilder arr = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                result.append(c);
            }else{
                arr.append(c);
                for(int i=0; i<words.length; i++){
                    if(arr.toString().equals(words[i])){
                        result.append(i);
                        arr.setLength(0);
                        break;
                    }
                }
            }
        }
        return answer = Integer.parseInt(result.toString());
    }
}