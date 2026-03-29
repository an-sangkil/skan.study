package org.example.plain;


import java.util.LinkedList;
import java.util.Queue;

public class BFSFriendSearch {

    public void bfs(int start, LinkedList<Integer>[] list, int nodeSize) {

        boolean visited[] = new boolean[nodeSize];
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int current = q.poll();
            System.out.print(current + " ");
            for (int n : list[current]) {
                if(!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }


    public static void main(String[] args) {
        int n = 6; // 0~5번까지 친구들
        LinkedList<Integer>[] adj = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new LinkedList<>();
        }

        // 인맥 연결 (양방향)
        adj[0].add(1); adj[1].add(0); // 0-1
        adj[0].add(3); adj[3].add(0); // 0-3
        adj[1].add(2); adj[2].add(1); // 1-2
        adj[3].add(4); adj[4].add(3); // 3-4
        adj[2].add(5); adj[5].add(2); // 2-5

        BFSFriendSearch f = new BFSFriendSearch();
        f.bfs(0, adj, n);
    }

}
