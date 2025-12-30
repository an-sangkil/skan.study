package org.example.plain;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * [철수 (0)]
 * /      \
 * [영희 (1)]  [민수 (3)]
 * |          |
 * [길동 (2)]  [지수 (4)]
 * |
 * [명일 (5)]
 */
public class DFSLinkedList {


    public void solutionStack(int start, LinkedList<Integer>[] adj, int size) {

        boolean[] visited = new boolean[size];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {

            int current = stack.pop();

            // 이미 방문된이력이 있다면 무시하고 다음노드
            if (visited[current]) {
                continue;
            }

            // 방문하는 노드에 대한 체크 및 꺼낸 노드에 대한 출력
            visited[current] = true;
            System.out.print(current + " ");

            // 꺼낸 노드에 대한 연결선 방문
            for (int neighbor : adj[current]) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }


    public void dfs(int start, LinkedList<Integer>[] adj, int size) {


        //스택
        System.out.println("--------------------------------------------- stack");
        this.solutionStack(start, adj, size);
        System.out.println();

        // 큐, 큐로 검색하면  BFS  가 된다.
        System.out.println("--------------------------------------------- queue");
        this.queueSolution(start,adj,size);
        System.out.println();

        // 재귀
        System.out.println("--------------------------------------------- recursion");
        boolean[] visited = new boolean[size];
        this.recursionSolution(start, adj, visited);
    }

    private void recursionSolution(int current, LinkedList<Integer>[] adj, boolean[] visited) {

        visited[current] = true;

        System.out.print(current + " ");
        for (int neighbor : adj[current]) {
            if (!visited[neighbor]) {
                recursionSolution(neighbor, adj, visited);
            }
        }

    }

    private void queueSolution(int start, LinkedList<Integer>[] adj, int nodeSize) {
        boolean[] visited = new boolean[nodeSize];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {

            int current = queue.poll();
            System.out.printf(current+ " ");

            for( int ner :  adj[current]) {

                if (!visited[ner]) {
                    visited[ner] = true;
                    queue.add(ner);
                }

            }


        }
        System.out.println();
    }


    public static void main(String[] args) {

        // 5개의 노드를 가정한다.
        int nodeSize = 6;

        // 노드를 이어줄 링크드리스트 생성
        LinkedList<Integer>[] adj = new LinkedList[nodeSize];
        for (int i = 0; i < nodeSize; i++) {
            adj[i] = new LinkedList<>();
        }

        adj[0].add(1);
        adj[1].add(0);
        adj[1].add(2);
        adj[2].add(1);
        adj[2].add(5);
        adj[5].add(2);
        adj[0].add(3);
        adj[3].add(0);
        adj[3].add(4);
        adj[4].add(3);

        DFSLinkedList bfs = new DFSLinkedList();
        //bfs.solution(0, adj, nodeSize);
        bfs.dfs(0, adj, nodeSize);


    }
}
