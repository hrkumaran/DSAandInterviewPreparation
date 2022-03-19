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
	public static void reverseList(SinglyLinkedList list) {
		SinglyLinkedList.Node first;
		SinglyLinkedList rest;

			/* empty list */
			//if (list == null)
			//return;

			first = list.head;
			//rest = first;

			/* List has only one node */
		//	if (rest == null)
		//		return;

			/* reverse the rest list and put the first element at the last */
		//	reverseList(rest);
			first.next.next = first;

			first.next = null;

			/* change the head pointer */
 		//	list.head = rest;
		}

}
