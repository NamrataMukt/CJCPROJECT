package com.braindata.bankmanagement.model.client;

import java.util.Scanner;
import com.braindata.bankmanagement.model.service.Rbi;
import com.braindata.bankmanagement.model.serviceImpl.Sbi;

public class Test {
	
	public static void main(String[] args)
	{
		Rbi s=new Sbi();
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("select\n"+"1. Create Account\n"+"2.Display All Deatails\n"+"3.Deposit Money"+"4.withdrawal\n"+"5.balanceCheck"+"6.exit");
			
			
			int a=sc.nextInt();
			if(a==1)
				s.createAccount();
			    
			else if(a==2)
				s.displayAllDetails();
			
			else if(a==3)
				s.depositeMoney();
			
			else if(a==4)
				s.withdrawal();
			
			else if(a==5)
				s.balanceCheck();
			
			else if (a==6)
				break;
		
								
			
		}
	}

}
