class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        StringBuilder arr = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++) {
            boolean result = false;
            for(int j : indices) {
                if(i == j) {
                    result = true;
                    break;
                }
            }
            if(result != true) {
                arr.append(my_string.charAt(i));
            }                 
        }
        return answer = arr.toString();
    }
}