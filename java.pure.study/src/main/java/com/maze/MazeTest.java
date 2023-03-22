package com.maze;

import java.util.Stack;

class MazeCells {
	int x;
	int y;
	int movePath;
	
	public MazeCells(int x, int y, int movePath) {
		this.x = x;
		this.y = y;
		this.movePath = movePath;
	}
	public String toString(){
		return x +","+y;
	}
}


public class MazeTest {
	int maze[][]= {
					{1,1,1,1,1,1,1,1,1,1},
					{1,0,0,0,1,0,1,1,1,1},
					{1,1,1,0,1,0,0,1,1,1},
					{1,1,1,0,0,0,0,0,0,1},
					{1,1,1,1,1,1,1,1,0,0}
				  };
	int move[][] = {
			{-1,0},
			{0,1},
			{1,0},
			{0,-1}
	};
	
	int endpointX = 4;
	int endpointY = 9;
	
	public void find(){
		Stack<MazeCells> st1 = new Stack<>();
		Stack<MazeCells> st2 = new Stack<>();
		
		st1.push(new MazeCells(1, 1, 1));
		
		int mark [][] = new int [maze.length][maze[0].length];
		
		while (!st1.isEmpty()) {
			MazeCells mc = st1.pop();
			while (mc.movePath <=3) {
				int x = mc.x + move[mc.movePath][0];
				int y = mc.y + move[mc.movePath][1];
				
				if(x == endpointX && y == endpointY) {
					st1.push(new MazeCells(x, y, mc.movePath));
					st1.push(new MazeCells(endpointX, endpointY, 0));
					while (!st1.isEmpty()) {
						st2.push(st1.pop());
					}
					
					for (MazeCells mazeCells : st2) {
						System.out.println(mazeCells.toString());
					}
					for (int[] is : mark) {
						System.out.println("mark = " + is.toString());
					}
					
					return ;
				}
				
				if(maze[x][y] == 0 && mark[x][y] == 0){
					
					st1.push(new MazeCells(x,y,mc.movePath));
					mark[x][y] = 1;
					mc.x = x;
					mc.y = y;
					mc.movePath = 0;
				}
				mc.movePath++;
				
			}
		}
		
		
	}
	
	public static void main (String args[]) throws Exception {
		MazeTest mazeTest = new MazeTest();
		mazeTest.find();
	}
}
