package com.active.collections;
import java.util.LinkedList;
import java.util.Iterator;

	public class LinkedList1 {
	public static void main(String args[]) {
		System.out.println();
		
		LinkedList list = new LinkedList();
		list.add("html");
		list.add("Java");
		list.add("Javascript");
		list.add("css");
		list.add("php");
		
		//System.out.println(list.getFirst());
		//System.out.println(list.getLast());
		//System.out.println(list.element());
		//list.offer("Frisco");
		//System.out.println(list.peek());
		//System.out.println(list.get(3));
		//list.pop();
		//list.push(1);
		System.out.println();
		
		Iterator itr = list.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
	