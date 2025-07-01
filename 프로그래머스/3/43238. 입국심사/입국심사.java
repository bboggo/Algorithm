import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 1;
        long end = (long) Arrays.stream(times).max().getAsInt() * n;
        long mid = 0;
        
        Arrays.sort(times);
        
        while(start<=end) {
            long sum = 0;
            mid = (start + end) / 2;
            for(int time: times){
                sum += mid / time;
            }

        
            if (sum >= n) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        
        return answer;
    }
}