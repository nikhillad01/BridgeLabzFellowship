package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class Gambler {
	
	public static void gambler(int stake,int trial,int goal) {
		  int wins=0;
		 int  bet=0;
		 int  N= trial;
		 int  loose=0;
		 int  cash=stake;
		for (int t = 0; t < trial; t++) {
			while((cash>0)&&(cash<goal)) {
				bet++;
				//int random = (int)(Math.random());
				if (Math.random()<0.5) {
					//wins++;
					cash++;
				}
				else {
					
					cash--;
				}
				
				
			if(cash==goal) {
				wins++;
				//System.out.println("Bets Win "+wins);
			}
			
			
			//bet++;
			}
			//if(trial==bet) {
				//break;
			//}
			
		}
		//System.out.println("Final cash "+cash);
		//System.out.println(wins  +"Wins of"+ trials);
		System.out.println(wins + " wins of " + trial);
		//System.out.println(loose + " loose of " + trial);
        System.out.println("Percent of games won = " + 100.0 * wins / trial);
        System.out.println("Avg # bets           = " + 1.0 * bet / trial);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Stake");
	int s=sc.nextInt();
	System.out.println("Enter Your Goal");
	int g=sc.nextInt();
	System.out.println("Enter Number of trials");
	int t=sc.nextInt();
	//System.out.println("Enter Betting amount");
	//int betamount=sc.nextInt();
	Gambler g1=new Gambler();
	g1.gambler(s,t,g);
	
	//Utility.gambler(s, t, g,);
}
}



