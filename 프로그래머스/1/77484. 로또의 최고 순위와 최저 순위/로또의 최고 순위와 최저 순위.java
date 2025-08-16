import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int maxCount = 0;
        int minCount = 0;

        List<Integer> arr = new ArrayList<>();
        for(int num : win_nums){
            arr.add(num);
        }

        for(int num : lottos){
            if(num == 0){
                minCount++;
            }else if(arr.contains(num)){
                maxCount++;
            }
        }

        int maxRank = result(maxCount + minCount);
        int minRank = result(maxCount);

        return new int[]{maxRank, minRank};
    }

    private int result(int count) {
        return count >= 2 ? 7 - count : 6;
    }

}