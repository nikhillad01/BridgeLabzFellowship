package com.Prj.functional;
import java.util.*;
import com.Prj.utilities.Utility;

public class NumberThink {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter num of questions ");
		int k =sc.nextInt(); 
        int n = (int) Math.pow(2, k);
        System.out.println("Think of an integer between 0 and"+(n-1));
        int secret = Utility.question(0, n);
        System.out.println("Your number is  "+secret);
	}

}
