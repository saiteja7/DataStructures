package com.LinkedList;

public class LinkedList {

	Node head;
	int size = 0;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	public void insertAtStart(int data) {
		Node node = new Node(data);
		node.next=head;
		head=node;
	}

	public void print() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public int size() {
		int size = 0;
		Node n = head;
		while (n != null) {
			size++;
			n = n.next;
		}
		System.out.println("size is " + size);
		return size;
	}

	public int sizeRecursive(Node n) {
		// Node n = head;
		size++;
		if (n == null) {
			return --size;
		}
		return sizeRecursive(n.next);

	}

	public void deleteFromEnd(int n) {
		Node temp = head;
		Node slow = temp;
		Node fast = temp;
		for (int i = 0; i < n + 1; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		slow.next = slow.next.next;

	}

	public int kthNodeFromEnd(int k) {
		
		Node slow =head;
		Node fast =head;
		for (int i=1;i<=k;i++) {
			fast=fast.next;
		}
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow.data;
	}
	public int kthNode(int n) {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;

			if (count == n) {
				return temp.data;
			}
			temp = temp.next;
		}

		return 0;
	}

	public int middleOFList() {
		
		Node slow =head;
		Node fast =head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
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
		list.insertAtStart(13);
		//list.insert(11);
		 list.print();
		// list.deleteFromEnd( 2);
		// System.out.println(list.sizeRecursive(list.head));
		//System.out.println(list.kthNode(4));
		//System.out.println(list.kthNodeFromEnd(3));
		//System.out.println(list.middleOFList());
	}
}
