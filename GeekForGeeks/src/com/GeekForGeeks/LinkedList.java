package com.GeekForGeeks;



public class LinkedList {
	
	public static void main(String[] args) {
	       LinkedList list = new LinkedList();
	       
	        //
	        // ******INSERTION******
	        //
	   
	        // Insert the values
	        list = insert(list, 1);
	        list = insert(list, 2);
	        list = insert(list, 3);
	        list = insert(list, 4);
	        list = insert(list, 5);
	        list = insert(list, 6);
	        list = insert(list, 7);
	        list = insert(list, 8);
	        list = insert(list, 9);
	        list = insert(list, 10);
	        list = insert(list, 13);
	       
	        //middleElement(list);
	        reverseList(list);
	        printlist(list);
	}
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){	
		 this.data=data;
		 this.next=null;
		}
	}
Node head =null;
public static LinkedList insert(LinkedList list ,int data) {
	Node new_node = new Node(data);
	new_node.next = null;
	if(list.head==null) {
		list.head=new_node;
	}else {
		Node n=list.head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=new_node;
	}
	return list;
	
}

public static LinkedList printlist(LinkedList list) {
	Node current = list.head;
			
	while(current.next!=null) {
		System.out.println(current.data);
		current=current.next;
	}
	System.out.println(current.data);
	
	
	return list;
	
}

public static int middleElement(LinkedList list) {
	Node current = list.head;
	Node fast = list.head;
	while(fast!=null && fast.next!=null) {
		fast=fast.next.next;
		current=current.next;
	
	}
	System.out.println(current.data);
	return current.data;
}

public static LinkedList reverseList(LinkedList list) {
	Node prev = null;
	Node current = list.head;
	Node next=null;
	while(current!=null) {
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	}
    list.head=prev;
   
	return list;
}

	
}
