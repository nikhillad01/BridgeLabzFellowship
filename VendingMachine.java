package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class VendingMachine {
	static int []allnotes= {1000,500,100,50,10,5,2,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your amount");
int amt=sc.nextInt();
Utility.vendingMachine(amt, allnotes);
	}

}
