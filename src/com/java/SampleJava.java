package com.java;

import java.util.ArrayList;
import java.util.List;



public class SampleJava {
	
	public static void main(String[]args) {
		List<Integer> ex = new ArrayList<Integer>();
		List<Integer> eg = new ArrayList<Integer>();
		ex.add(10);
		ex.add(30);
		ex.add(30);
		ex.add(40);
		ex.add(50);
		eg.add(1);
		eg.add(2);
		eg.add(30);
		eg.add(9);
		eg.addAll(ex);
		System.out.println(ex);
		System.out.println(eg);
		eg.retainAll(ex);
		System.out.println(eg);
		
		
		
		
		
		
		
	}	
}
	
