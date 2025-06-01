class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i = 3; i < brown+yellow; i++) {
            int r = i;
            int c = (brown+yellow)/r;
            
            if((r-2) * (c-2) == yellow) {
                answer[0] = r;
                answer[1] = c;
            }
        }
        return answer;
    }
}