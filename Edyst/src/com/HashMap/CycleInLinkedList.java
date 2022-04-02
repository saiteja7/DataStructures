package com.HashMap;

import java.util.HashSet;

import com.LinkedList.Node;

public class CycleInLinkedList {

	public static void main(String[] args) {

	}

	// using hashing
	private static int detectCycle(Node head) {
		HashSet<Node> set = new HashSet<Node>();
		Node temp = head;
		while (temp != null) {
			if (set.contains(temp)) {
				return 1;
			}

			set.add(temp);
			temp = temp.next;
		}

		return 0;

	}

	// without hash map
	private static int detectCycle1(Node head) {
		Node slow = head;
		Node fast = head;
		while (slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return 1;
			}
		}

		return 0;

	}

}
