import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> rightMap = new HashMap<>();
        Set<Integer> leftSet = new HashSet<>();
        
        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
        }
        
        int answer = 0;
        
        for(int i = 0; i < topping.length; i++) {
            int t = topping[i];
            
            // 왼쪽에 추가하고
            // 오른쪽에선 하나 뺌
            // 만약 오른쪽에서 0이 되면 아예 없는거니까 remove
            
            leftSet.add(t);
            rightMap.put(t, rightMap.get(t) - 1);
            if(rightMap.get(t) == 0) {
                rightMap.remove(t);
            }
            
            if(leftSet.size() == rightMap.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}