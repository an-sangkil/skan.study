package com.collection;
import java.util.Iterator;
import java.util.Stack;

class MazeCell {
	int x;
	int y;
	int movePath;
	
	public String toString(){
		return "<"+x + " , " + y +">";
	}
	
	public MazeCell(int x, int y, int movePath) {
		this.x = x;
		this.y = y;
		this.movePath = movePath;
	}
}

public class Maze {
	int maze[][]={
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,1,0,0,0,1,1,1,1},
			{1,0,1,0,1,0,1,1,1,1},
			{1,0,0,0,1,0,1,1,1,1},
			{1,1,1,0,1,1,1,1,1,1},
			{1,1,1,0,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,1,1,0,1,1,1},
			{1,1,1,0,1,1,0,1,1,1},
			{1,1,1,1,1,1,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}
	};
	
	
	Stack<MazeCell> st1 = new Stack<>();
	Stack<MazeCell> st2 = new Stack<>();
	int mark[][] = new int [maze.length][maze[0].length];
	int move[][] = {{-1,0},{0,1},{1,0},{0,-1}};
	int endpointX = 9;
	int endpointY = 8;
	public void find(){ 
		
		st1.push(new MazeCell(1, 1, 0));
		
		while(!st1.isEmpty()) {
			MazeCell mz = st1.pop();
			while(mz.movePath <=3){
				
				int x = mz.x + move[mz.movePath][0];
				int y = mz.y + move[mz.movePath][1];
				//출구 값이 맞는 경우;
				if(mz.x == endpointX && mz.y == endpointY){
					System.out.println("출구");
					
					// 마지막 포인트 삽입
					st1.push(new MazeCell(mz.x, mz.y, mz.movePath));
					while(!st1.isEmpty()) {
						st2.push(st1.pop());
					}
					
					for (MazeCell mazeCell : st2) {
						System.out.println(mazeCell.toString());
					}
					
					
					
					
					return ;
				}
				
				//나아갈 방향이 있는경우
				if(maze[x][y]== 0 && mark[x][y] ==0 ) {
					mark[x][y] = 1; //이미 지나온 방향 처리
					st1.push(new MazeCell(mz.x, mz.y, mz.movePath));
					
					mz.x = x;
					mz.y = y;
					mz.movePath=0;
				} else {
					mz.movePath++;
				}
				
				
			}
		}
	}
	
	public static void main(String[] args) {
		Maze mzMaze = new Maze();
		mzMaze.find();
	}
	
}
