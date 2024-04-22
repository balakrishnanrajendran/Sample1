package com.app.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleOne {

	public static void main(String[] args) {
		/*
		 * List<Integer> l1 = new ArrayList<Integer>(); l1.add(1); l1.add(4);
		 * List<Integer> l2 = new ArrayList<Integer>(); l2.add(2); List<Integer> l3 =
		 * new ArrayList<Integer>(); l3.add(3);
		 * 
		 * List<List<Integer>> list = new ArrayList<List<Integer>>(); list.add(l1);
		 * list.add(l2); list.add(l3);
		 * 
		 * System.out.println(list.get(0).get(1));
		 */
		
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(1, 11);
		map1.put(2, 13);
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		map2.put(4, 7);
		map2.put(3, 8);
		Map<Integer, Integer> map3 = new HashMap<Integer, Integer>();
		map3.put(5, 10);
		map3.put(6, 9);
		
		List<Map<Integer, Integer> > map = new ArrayList<Map<Integer,Integer>>();
		map.add(map1);
		map.add(map2);
		map.add(map3);
		System.out.println(map.get(0).get(1));
		System.out.println(map.get(1).get(4));
		
	}

}
