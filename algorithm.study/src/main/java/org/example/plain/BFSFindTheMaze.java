package org.example.plain;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 가장 빠른 길찾기 
 * https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */
public class BFSFindTheMaze {

    int[] dr = {-1,1,0,0};
    int[] dc = {0,0,-1,1};

    public int soluction(int[][] maps){

        int n = maps.length ;   // 행
        int m = maps[0].length;  // 열

        boolean[][] visited =  new boolean[n][m];

        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{0,0,1});//0,0에서 시작 거리는 1
        visited[0][0] = true; //방문처리

        while(!queue.isEmpty()) {

            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int dist = current[2]; //거리

            // 현재 위치가 목적지인경우 
            if( r==n-1 && c== m-1){
                return dist;
            }

            // 4방향 탐색
            for (int i=0 ; i<4; i++){
                int nr = r+dr[i];
                int nc = c+dc[i];

                // 유효성 검사 
                if(nr >= 0 && nr< n && nc>=0 && nc <m) {
                    if (maps[nr][nc] == 1 &&!visited[nr][nc]) {
                        
                        visited[nr][nc]= true;
                        queue.add(new int[]{nr,nc,dist+1});
                    }

                }


            }

        }
        return -1;
    }

    public static void main(String[] args) {

        BFSFindTheMaze bfsFindTheMaze = new BFSFindTheMaze();

        int dist = bfsFindTheMaze.soluction(new int[][]{{1,1,1},{1,0,1},{1,1,1},{1,0,1},{1,1,1}});
        System.out.println(dist);

    }

}
