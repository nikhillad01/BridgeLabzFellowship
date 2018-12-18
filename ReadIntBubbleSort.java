package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class ReadIntBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array[]=new int[5];
		for(int i = 0;i<array.length;i++) {
		System.out.println("Enter Element");
		array[i]=sc.nextInt();
			
		}
		Utility.bubbleSort(array);
	}


	

}
