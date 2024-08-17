package com.singly.circularlist;

import java.util.Scanner;

import sunbeam.SinglyCircularList;

public class singlyCircularList {
	static class Node{
		private int data; //Node class fields
		private Node next;
		public Node ()  // constructor for  Node
		{
			data=0;
			next= null;
		}
		public Node (int val) // parametric constructor for  Node
		{
			data=val;
			next= null;
		}
	}
	private Node head;
	
	public singlyCircularList () // constructor for Head
	{
		head=null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void Display()
	{
		System.out.println("List:- ");
		Node trav = head; // referencing to head
		
		if(isEmpty())
			return;
		// Print all nodes;
		do
		{
			System.out.println(trav.data); // Printing data of list
			trav= trav.next; // referencing to next address of trav
		}
		while(trav != null);
	}
	public void addLast (int val)
	{
		Node newNode = new Node();
		Node trav = head;
		if (isEmpty())
		{
			head = newNode;
			newNode=head; // by writing this head becomes circular form of list;
		}
		
		while(trav.next!=head) {
			trav=trav.next;
			newNode.next=head;
			trav=newNode;
		}
	}
	
	public void addFirst (int val)
	{
		Node newNode = new Node();
		Node trav = head;
		if (isEmpty())
		{
			head = newNode;
			newNode=head; // by writing this head becomes circular form of list;
		}
		
		while(trav.next!=head) {
			trav=trav.next; //trav.next travel till last position
			head=newNode.next; // copy the address of newNode in head
			trav=newNode; // last node of linklist is copied to the  
			head=newNode; //address of head is pointing towards newnode
		}
	}
	
	// Add at position
	public void addPos(int val, int pos)
	{
		Node newNode = new Node ();
		Node trav = head;
		
		if ( head == null || pos>1 )
		{
			addFirst(val);
		}
		else 
		{
			for (int i=0; i<pos-1; i++)
			{
				if(trav.next == head)
					break;
			trav = trav.next;
			}
			 newNode.next=trav.next;
			trav.next=newNode;
			
		}
	}
	
	//Delete first
	public void delFirst()
	{
		if (isEmpty())
		{
			throw new RuntimeException("List is Empty");
		}
		if (head.next==head)
		{
			head=null;
		}
		else {
		Node trav = head;
		while(trav!=head)
		{
			trav = trav.next;
			head = head.next;
			trav.next=head;
		}
	}
	}
	public void delAtPos(int pos)
	{
		if(pos == 1)
			delFirst();
		// special 2: if list is empty or pos < 1, then throw exception.
		if(head == null || pos < 1)
			throw new RuntimeException("List is empty or Invalid position.");
		// take temp pointer running behind trav.
		Node temp = null, trav = head;
		// traverse till pos (trav)
		for(int i = 1; i < pos; i++) {
			// special 3: if pos is beyond list length, then throw exception.
			if(trav.next == head)
				throw new RuntimeException("Invalid position.");
			temp = trav;
			trav = trav.next;
		}
		// trav is node to be deleted & temp is node before that
		temp.next = trav.next;
		// trav node will be garbage collected
	}
	
	public class SinglyCircularListMain {
		public static void main(String[] args) {
			int choice, val, pos;
			SinglyCircularList list = new SinglyCircularList();
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1: // Display
					list.display();
					break;
				case 2: // Add First
					System.out.print("Enter new element: ");
					val = sc.nextInt();
					list.addFirst(val);
					break;
				case 3: // Add Last
					System.out.print("Enter new element: ");
					val = sc.nextInt();
					list.addLast(val);
					break;
				case 4: // Add At Pos
					System.out.print("Enter new element: ");
					val = sc.nextInt();
					System.out.print("Enter element position: ");
					pos = sc.nextInt();
					list.addAtPos(val, pos);				
					break;
				case 5: // Del First
					try {
						list.delFirst();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 6: // Del Last
//					try {
//						list.delLast();
//					} catch (Exception e) {
//						System.out.println(e.getMessage());
//					}
					break;
				case 7: // Del At Pos
					System.out.print("Enter element position: ");
					pos = sc.nextInt();
					try {
						list.delAtPos(pos);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 8: // Del All
					list.delAll();
					break;
				}
			} while(choice!=0);
			sc.close();
		}

	}