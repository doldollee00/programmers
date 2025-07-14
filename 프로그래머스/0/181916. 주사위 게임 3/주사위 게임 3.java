import java.util.HashMap;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (map.size() == 1) {
            return 1111 * a;
        } else if (map.size() == 2) {
            for (int key : map.keySet()) {
                int count = map.get(key);
                if (count == 3) {
                    int p = key;
                    int q = 0;
                    for (int k : map.keySet()) {
                        if (k != p) q = k;
                    }
                    return (int) Math.pow(10 * p + q, 2);
                }
            }
            int[] keys = new int[2];
            int idx = 0;
            for (int key : map.keySet()) {
                keys[idx++] = key;
            }
            return (keys[0] + keys[1]) * Math.abs(keys[0] - keys[1]);
        } else if (map.size() == 3) {
            int pair = 0;
            int q = 0, r = 0;
            for (int key : map.keySet()) {
                int count = map.get(key);
                if (count == 2) pair = key;
                else if (q == 0) q = key;
                else r = key;
            }
            return q * r;
        } else {
            int min = a;
            min = Math.min(min, b);
            min = Math.min(min, c);
            min = Math.min(min, d);
            return min;
        }
    }
}




