import java.util.*;

class Solution {
    int[] dx = {0, 1, -1, 0};
    int[] dy = {1, 0, 0, -1};
    public int solution(int[][] maps) {
        int answer = 0;
      int[][] visited = new int[maps.length][maps[0].length];
        bfs(maps, visited);
        answer = visited[maps.length - 1][maps[0].length-1];
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }
    
    public void bfs(int[][] maps, int [][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        visited[0][0] = 1;
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i]; // 다음 행 좌표
                int ny = y + dy[i]; // 다음 열 좌표

                // 1. 맵 범위 안에 있는지 확인
                // 2. 벽이 아닌지 (maps[nx][ny] == 1) 확인
                // 3. 아직 방문하지 않은 곳인지 (visited[nx][ny] == 0) 확인
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) { // 맵 범위 체크
                    if (maps[nx][ny] == 1 && visited[nx][ny] == 0) { // 갈 수 있는 길(1)이고 아직 방문 안 한 곳
                        visited[nx][ny] = visited[x][y] + 1; // 현재 칸까지의 거리 + 1
                        q.add(new int[]{nx, ny}); // 다음 위치를 큐에 추가
                    }
                }
            }
            

        }
    }
}