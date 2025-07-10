class Solution {
    int [][] dp;
    
    public int findMax(int index, int[][] triangle, int depth) {
        if (depth == triangle.length) 
            return dp[depth][index];
        if (dp[depth][index] == 0)
            dp[depth][index] = Math.max(findMax(index, triangle, depth + 1), //왼쪽 오른쪽 중 큰값 반환
                            findMax(index + 1, triangle, depth + 1)) + triangle[depth][index];
        return dp[depth][index];
    }
    public int solution(int[][] triangle) {
        dp = new int[triangle.length][triangle.length];
        //dp 맨 밑을 triangle과 똑같이 세팅
        for (int i = 0; i < triangle.length; i++)
            dp[triangle.length - 1][i] = triangle[triangle.length - 1][i];
        int max = findMax(0, triangle, 0);
        return max;
    }
}