import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        int index = 0;
        
        for(int i=0; i<strArr.length; i++) {
            index = strArr[i].indexOf("ad");
            if(index == -1) {
                answer.add(strArr[i]);
            }
        }
        return answer.toArray(new String[0]);
    }
}