package com.google.tryit.ds;

public class SinglyLinkedList {

	static class Node {
		String value;
		Node next;

		Node(String d) {
			value = d;
			next = null;
		}
	}

	Node head;

	public static SinglyLinkedList insertNode(SinglyLinkedList list, String data) {
		Node newNode = new Node(data);
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}
		return list;
	}

	public static void printNode(SinglyLinkedList list) {
		while (list.head != null) {
			System.out.println(list.head.value);
			list.head = list.head.next;
		}
	}
	public static SinglyLinkedList.Node reverseList(SinglyLinkedList.Node list) {
		SinglyLinkedList.Node first;
		SinglyLinkedList rest;

		/* empty list */
		if (list == null || list.next == null)
		{
			return list;
		}

		SinglyLinkedList.Node returnNode = reverseList(list.next);
		list.next.next = list;
		list.next = null;
		return returnNode;
			/* change the head pointer */
 		//	list.head = rest;
		}

}
