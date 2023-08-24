package com.braindata.bankmanagement.model.serviceImpl;
import java.util.Scanner;
import com.braindata.bankmanagement.model.service.Rbi;
import com.braindata.bankmanagement.model.Account;


public class Sbi implements Rbi {
	
	Scanner sc=new Scanner(System.in);
	Account ac=new Account();
	
		public void createAccount()
		{
			System.out.println("createAccount");
			System.out.println("Enter Account no");
			int accno=sc.nextInt();
			ac.setAccNo(accno);
			
			System.out.println("Enter name");
			String nm=sc.next();
			ac.setName(nm);
			
			System.out.println("Enter mobile number");
			long mb=sc.nextLong();
			ac.setMobNo(mb);
			
			System.out.println("Enter Adhaar number");
			long adhaar=sc.nextLong();
			ac.setAdharNo(adhaar);
			
			System.out.println("Enter Gender");
			String gender=sc.next();
			ac.setGender(gender);
			
			System.out.println("Enter age");
			int age=sc.nextInt();
			ac.setAge(age);
			
			System.out.println("Enter balance");
			double balance=sc.nextDouble();
			if(balance>1000)
			{
				ac.setBalance(balance);
				System.out.println("Accepted");
			}
			else {
				System.out.println("not accepted");
			}
			
						
		}
		public void displayAllDetails()
		{
			System.out.println("Account number="+ac.getAccNo());
			System.out.println("Account holder name="+ac.getName());
			System.out.println("Mobile number="+ac.getMobNo());
			System.out.println("customer adhaar number="+ac.getAdharNo());
			System.out.println("customer gender="+ac.getGender());
			System.out.println("customer age"+ac.getAge());
			System.out.println("Customer balance"+ac.getBalance());
			
		}
		public void depositeMoney()
		{
			System.out.println("Enter deposited money");
			double d=sc.nextDouble();
			double newBal=d+ac.getBalance();
			if(d>1000) {
				ac.setBalance(newBal);
				System.out.println("deposit mony acceptes");
			}
			else {
				System.out.println("not ccepted");
			}
			
		}
		public void withdrawal()
		{
			System.out.println("Enter withdrawal amount");
			double d1=sc.nextDouble();
			double newBal2=ac.getBalance()-d1;
			ac.setBalance(newBal2);
		}
		public void balanceCheck()
		{
			System.out.println("Updated balance="+ac.getBalance());
		}
	}




