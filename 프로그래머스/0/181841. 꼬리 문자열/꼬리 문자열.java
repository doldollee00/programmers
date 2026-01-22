class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<str_list.length; i++) {
            boolean test = str_list[i].contains(ex);
            if(!test) {
                result.append(str_list[i]);
            }
        }
        return answer = result.toString();
    }
}