package com.google.tryit;

import com.google.tryit.ds.DoublyLinkedList;

public class Outouts {

	public static void main(String[] args) {
//		Stack stack = new Stack();
//		for (int i = 0; i < 22; i++) {
//			stack.push("TryIam" + i);
//		}
//		for (int i = 0; i < 22; i++) {
//			System.out.println(stack.pop());
//		}
//		
//		Queue queue = new Queue();
//		for (int i = 0; i < 22; i++) {
//			queue.enqueue("TryIam" + i);
//		}
//		for (int i = 0; i < 22; i++) {
//			System.out.println(queue.dequeue());
//		}

		DoublyLinkedList listNode = new DoublyLinkedList();
		listNode.insertNode(listNode, "1");
		listNode.insertNode(listNode, "6");
		listNode.insertNode(listNode, "2");
		listNode.insertNode(listNode, "90");
		listNode.insertNode(listNode, "5");
		listNode.insertNode(listNode, "90");
		listNode.insertNode(listNode, "4");
		listNode.insertNode(listNode, "3");

	   listNode.printNode(listNode);
		//String middleName = listNode.findMiddleValueinSLL(listNode);

		//System.out.println(middleName);
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		
	}
}
