package com.overrride.abstracts;

public class Figure {
	
	private double a,b;
	
	public class 삼각형 extends FigureAbstract {
		
		public 삼각형(int attributeOne,int attributeTwo) {
			
		}

		@Override
		public void drows(){
			System.out.println("삼각형의 면적을 구하셨습니다.");
		}
	}
	
	
	public class 사격형 extends FigureAbstract {

		@Override
		public void drows() {
			System.out.println("사각형의 면적을 구하셨습니다.");
		}
		
	}
	
	public static void main(String args){
		//Figure  삼각  = new 삼각형(1, 20);
	}
	

}
