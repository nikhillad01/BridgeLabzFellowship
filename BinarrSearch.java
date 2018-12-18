package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class BinarrSearch {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int arr[]= {1,2,3,4,5,6,7,8,9};
String strings[]= {"answer","janhvi","pushkar","nikhil","shazad","sag","bob"};

System.out.println("enter element to search");
int key= sc.nextInt();
Utility.binarsearch(arr, key);

System.out.println("Enter string to search");
String s=sc.nextLine();
Utility.searchString2(strings, s);

	}

}
