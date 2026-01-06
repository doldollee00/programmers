import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        int index =0;
        int i = 0;
        
        while((index = my_string.indexOf(" ", i)) != -1) {
            answer.add(my_string.substring(i,index));
            i = index + 1;
        }      
        answer.add(my_string.substring(i));
        return answer.toArray(new String[0]);
    }
}