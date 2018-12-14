package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class TwoDArray {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of rows");
		int nrows=sc.nextInt();
		System.out.println("Enter number of columns");
		int ncols=sc.nextInt();
		int matrix[][]=new int [nrows][ncols];
		for (int i=0;i<nrows;i++) {
			for(int j=0;j<ncols;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		Utility.twodarray(matrix, nrows, ncols);
	}

}
