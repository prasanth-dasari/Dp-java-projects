package com.active.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add(2018);
		list.add("By Sage");
		list.add(3);
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		} 
		
		}

}

	

 