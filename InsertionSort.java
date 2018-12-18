package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class InsertionSort {

	

	public static void main(String[] args) throws Exception {
	String[] arrstring ={"Mumbai","Pune","aaa","Delhi","Nashik","thane","zak"};
		Utility.stringInsertionSort(arrstring);
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner (System.in);
		int arr[]= {12,11,13,3,6,9,10};
		//Utility.insertionsort(arr);
	
		//ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Bubble sort");
		Utility.bubbleSort(arr);
		
	}

}
