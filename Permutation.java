package com.Prj.functional;

import com.Prj.utilities.Utility;
import java.util.*;
public class Permutation {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		String str=sc.nextLine();
		Utility.permute(str);
	}

}
