import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
     
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == a[i%a.length]) score[0]++;
            if(answers[i] == b[i%b.length]) score[1]++;
            if(answers[i] == c[i%c.length]) score[2]++;
        }
       
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        //System.out.println(max);
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < score.length; i++) {
            if(score[i] == max) {
                answer.add(i+1);
            }
        }
        int[] ans = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }
    
        
        return ans;
    }
}