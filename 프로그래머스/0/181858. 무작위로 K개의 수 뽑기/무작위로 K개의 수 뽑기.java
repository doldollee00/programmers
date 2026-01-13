import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                list.add(num);
                seen.add(num);
            }
            if (list.size() == k) break;
        }

        while (list.size() < k) {
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
