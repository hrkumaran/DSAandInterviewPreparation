package com.google.tryit;

import com.google.tryit.ds.DoublyLinkedList;

public class Outouts {

	public static void main(String[] args) {
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

	}
}
