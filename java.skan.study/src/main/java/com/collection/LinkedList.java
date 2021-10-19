package com.collection;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	private class Node {
		
		public Object data;
		public Node next;
		
		public Node(Object input){
			this.data =  input;
		}
		
	}

	public void addFirst(Object input) {
		// 노드 초기화
		Node temp = new Node(input);
		// 첫번째 헤더를 넥스트로
		temp.next =  head;
		
		head = temp;
		if(head.next == null) {
			tail = head;
		}
		size++;
	}

	public void addLast(Object input) {
		Node temp = new Node(input);
		if(size == 0 ) {
			addFirst(input);
		} else {
			tail.next = temp;
			tail = temp;
			size++;
		}
		
		
	}

	public void add(int i, Object input) {
		
		if( i == 0 ) {
			addFirst(input);
			return ;
		}
		
		Node temp1 = head;
		for (int j = 0; j < i-1; j++) {
			temp1 = temp1.next;
		}
		Node temp2 = temp1.next;
		Node newNode = new Node(input);
		temp1.next= newNode;
		newNode.next=temp2;
		size++;
		if(newNode.next == null){
			tail = newNode;
		}
	}
	
	
}
