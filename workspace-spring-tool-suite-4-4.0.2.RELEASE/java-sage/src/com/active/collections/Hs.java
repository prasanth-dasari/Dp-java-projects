package com.active.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hs {
	public static void main(String args[]) {
		HashSet hset = new HashSet();
		hset.add("frisco");
		hset.add("plano");
		hset.add("irving");
		hset.add("denton");
		hset.add(null);

		System.out.println();
		Iterator itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
