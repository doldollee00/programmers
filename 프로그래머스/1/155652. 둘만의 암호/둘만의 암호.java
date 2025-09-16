class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder arr = new StringBuilder();

        
        for(char c : s.toCharArray()) {
            arr.append(shiftChar(c, skip, index));
        }
        return arr.toString();
    }
    
    public char shiftChar(char c, String skip, int index) {
        int count = 0;
        while (count < index) {
            c++;
            if(c > 'z') {
                c = 'a';
            }
            if(!skip.contains(String.valueOf(c))) {
                count++;
            }
        }
        return c;
    }
}