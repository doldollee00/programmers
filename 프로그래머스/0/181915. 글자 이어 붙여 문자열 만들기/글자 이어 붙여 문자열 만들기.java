class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder asd = new StringBuilder();
        char[] arr = my_string.toCharArray();
        
        for(int i=0; i<index_list.length; i++) {
            int num = index_list[i];
            asd.append(arr[num]);
        }
        answer = asd.toString();
        
        return answer;
    }
}