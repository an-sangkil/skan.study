package com.datastructure;

public class Stack {
	private int top = -1 ;
	private Object data[];
	private int size;
	
	public Stack(int size){
		this.size = size;
		data = new Object[this.size];
	}
	
	public void push (Object input){
		top++;
		data[top] = input;
	}
	
	public Object pop (){
		return data[--top];
	}
	
	public Object peek(){
		return data[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
}
