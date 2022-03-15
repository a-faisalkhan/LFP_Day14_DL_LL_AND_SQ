package com.bridgelabz.ds.linkedlist.test;

import org.junit.Test;

import com.bridgelabz.ds.linkedlist.INode;
import com.bridgelabz.ds.linkedlist.MyLinkedList;
import com.bridgelabz.ds.linkedlist.MyNode;

public class MyLinkedListTest {

	@Test
	public void addFirstThreeNode() {
		System.out.println(
				"----------------addFirstThreeNode---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(70);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(56);
		//INode<Integer> fourthNode = new MyNode<>(75);
		//INode<Integer> fifthNode = new MyNode<>(43);
		//INode<Integer> sixNode = new MyNode<>(77);
		//INode<Integer> sevenNode = new MyNode<>(20);
		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);
		//intList.add(fourthNode);
		//intList.add(fifthNode);
		//intList.add(sixNode);
		//intList.add(sevenNode);

		System.out.println(intList);
	}
	@Test
	public void appendNodeAtLast() {
		System.out.println(
				"------------------appendNodeAtLast--------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);

		System.out.println(intList);
		System.out.println(
				"Size of LinkedList : " + intList.size());
	}

	@Test
	public void insertNodeAtIndex() {
		System.out.println(
				"-------------------insertNodeAtIndex---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(70);
		INode<Integer> thirdNode = new MyNode<>(30);
		INode<Integer> fourthNode = new MyNode<>(40);

		intList.addLast(firstNode);
		intList.addLast(secondNode);

		intList.insert(1, thirdNode);

		intList.insert(2, fourthNode);

		System.out.println(intList);
	}

	@Test
	public void pop() {
		System.out.println(
				"-------------------pop---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);

		System.out.println("Before pop : " + intList);
		System.out.println("Popped out node : "+intList.pop());
		System.out.println("After pop : " + intList);
	}

	@Test
	public void popLast() {
		System.out.println(
				"-------------------popLast---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);
		
		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);
		
		System.out.println("Before pop : " + intList);
		System.out.println("Popped out node : "+intList.popLast());
		System.out.println("After pop : " + intList);
	}
}
