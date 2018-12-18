package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class ReadUserIPInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			String array[]=new String[6];
			for(int i = 0;i<array.length;i++) {
			System.out.println("Enter Element");
			array[i]=sc.nextLine();
				
			}
			Utility.stringInsertionSort(array);
		}
	

}
