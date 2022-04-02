package com.LinkedList;

public class DoublyLinkedList {

	DoublyNode head;

	public void insert(int data) {
		DoublyNode node = new DoublyNode(data);
		if (head == null) {
			head = node;
		} else {
			DoublyNode n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.prev=n;
		}
	}
	
	public void insertAtStart(int data) {
		DoublyNode node = new DoublyNode(data);
		head.prev=node;
		node.next=head;
		head=node;
	
		
	}
	public void print() {
		DoublyNode n = head;
		while (n != null) {

			System.out.println(n.data);
//			if(n.prev!=null)
//			{
//				System.out.println("Previous for " +n.data+ " is " +n.prev.data);
//			}
//			
//			else {
//				System.out.println("Previous for "+ n.data+ " is null");
//			}

			n = n.next;

		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		list.insert(10);
		list.insertAtStart(14);;
		//list.insert(11);
		 //list.print();
		// list.deleteFromEnd( 2);
		// System.out.println(list.sizeRecursive(list.head));
		//System.out.println(list.kthNode(4));
		//System.out.println(list.kthNodeFromEnd(3));
	//list.print();
		 proc1();
	}
	
	static void proc1() {
		System.out.println("hello");
		throw new IllegalAccessError("hi");
	}
}
