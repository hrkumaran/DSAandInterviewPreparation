package com.google.tryit.ds;

public class DoublyLinkedList {

	static class Node {
		String value;
		Node next;
		Node prev;
		
		Node(String d) {
			value = d;
		}
	}

	Node head;
	

	public static DoublyLinkedList insertNode(DoublyLinkedList list, String data) {
		Node newNode = new Node(data);
		if (list.head == null) {
			list.head = newNode;
		} else if (list.head != null) {
			list.head.prev = newNode;
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			list.head = last;
			last.next = newNode;
		}
		return list;
	}

	public static void printNode(DoublyLinkedList list) {
		while (list.head != null) {
			System.out.println("Prev=" + list.head.prev.value);
	        System.out.println("Next=" + list.head.next.value);
		}
	}

	public String findMiddleValueinSLL(DoublyLinkedList listNode) {
		int length = 0;// TODO Auto-generated method stub
		Node middle = listNode.head;
		while (listNode.head != null) {
			// System.out.println(listNode.next.value);
			length++;
			if (length % 2 == 0) {
				middle = middle.next;
			}
			listNode.head = listNode.head.next;
		}
		String middleValue = null;
		if (length % 2 == 1 || length % 2 == 0) {
			middleValue = middle.value;
		}
		return middleValue;
	}
}
