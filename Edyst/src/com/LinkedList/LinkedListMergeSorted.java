package com.LinkedList;

public class LinkedListMergeSorted {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(3);
		list.insert(3);
		list.insert(7);
		list.insert(9);
		LinkedList list1 = new LinkedList();
		list1.insert(2);
		list1.insert(4);
		list1.insert(5);
		list1.insert(6);
		list1.insert(8);
		// mergeSorted(list.head, list1.head).print();
		LinkedList newList = new LinkedList();
		newList.head = mergeSortedList(list.head, list1.head);
		newList.print();
	}

	//Time Complexity O(n+m);
	public static Node mergeSortedList(Node a, Node b) {

		Node result = null;
		if (a == null && b != null) {
			return b;
		} else if (b == null && a != null) {
			return a;
		} else if (a == null && b == null) {
			return null;
		}

		if (a.data <= b.data) {
			result = a;
			result.next = mergeSortedList(a.next, b);
		} else {
			result = b;
			result.next = mergeSortedList(a, b.next);
		}
		return result;

	}

	//Time Complexity O(n*m);
	public static LinkedList mergeSorted(Node a, Node b) {
		LinkedList newList = new LinkedList();

		while (a != null && b != null) {

			if (a.data < b.data) {
				// newList.insert(a.data);
				newList.insertAtStart(a.data);
				a = a.next;
			} else if (a.data > b.data) {
				// newList.insert(b.data);
				newList.insertAtStart(b.data);
				b = b.next;
			}

		}
		if (a != null) {
			// newList.insert(a.data);
			newList.insertAtStart(a.data);
			a = a.next;
		}
		if (b != null) {
			// newList.insert(b.data);
			newList.insertAtStart(b.data);
			b = b.next;
		}

		return newList;

	}
}
