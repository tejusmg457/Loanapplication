import java.util.Scanner;

abstract class loan
{
	abstract void log();
	abstract void customer();
	abstract void disp1() throws InterruptedException;
	abstract void intcal() throws InterruptedException;
	abstract void bank() throws InterruptedException;
}

class login extends loan
{
	int password;
	String email;
	
	public void log()
	{
		System.out.println("Please login");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter userid");
		email =(String)scan.next();
		System.out.println("===========================");
		System.out.println("Enter Password");
		password=scan.nextInt();
		System.out.println("===========================");
		System.out.println("Login completed");
	}

	@Override
	void customer() {
	}

	@Override
	void disp1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void intcal() {
		
	}

	@Override
	void bank() {
		
	}
}	

class cifc extends loan				//collecting information from customer
{
	int salary,cibilscore, age, loanamount, dur, dur1, maxamount, opt,opt1;
	String name;
	long Aadharnum;
	String City;
	float finalloanamount,emiamount,intr, a,b,c,d,e,f,g,h,i,j;
		
	void customer()
	{
		System.out.println("======================================================================================================");
		Scanner scan=new Scanner(System.in);
		System.out.println("We required your personal details please fill correctly to further processing your application");
		System.out.println("======================================================================================================");
		System.out.println("Enter your name");
		name =(String)scan.next();
		System.out.println("=================================================================================");
		System.out.println("Enter your age");
		age=scan.nextInt();
		System.out.println("=================================================================================");
		System.out.println("Enter your city name");
		City =(String)scan.next();
		System.out.println("=================================================================================");
		System.out.println("Enter your Aadhar number");
		Aadharnum=scan.nextLong();
		System.out.println("=================================================================================");
		System.out.println("Enter the monthly salary you get:");
		salary=scan.nextInt();
		System.out.println("=================================================================================");
		System.out.println("Enter your cibil score:");
		System.out.println("=================================================================================");
		cibilscore=scan.nextInt();

		{
			if (cibilscore >= 300 && cibilscore<=900)
			{
				System.out.print("");	
			}
			else
			{	
				{
				do
					{
						System.out.println("you entered cibil score is wrong");
						System.out.println("cibil score always lies in between 300 to 900");
							
						int cibilscore1;
						Scanner scan3=new Scanner(System.in);
						System.out.println("Customer please reenter your cibil score:");
						System.out.println("===============================================");
						cibilscore1=scan3.nextInt();
						cibilscore = cibilscore1;
					}
						while(cibilscore<300 || cibilscore>900);
				}
			}
		}
		
		if (salary >= 20000 && cibilscore >= 350 && age>17 &&  age<=50 )
		{
			System.out.println("Thank you! you are eligible for loan");
			System.out.println("====================================");
		}
		else
		{
			System.out.println("Sorry! you are not eligible for loan");
			System.out.println("Required criteria to avail loan is salary should be > 19999, Cibil score > 349, age >= 18 & <=50");
			System.out.println("===========================================================================================");
			System.exit(0);
		}
			
	}
	void disp1() throws InterruptedException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the amount you required");
		System.out.println("====================================");
		loanamount=scan.nextInt();
		System.out.println("Wait a second We'll check the maximum amount will able to credit");
		System.out.println("==================================================================");
		try
		{
			Thread.sleep(5000);
		}
		finally
		{
			if (cibilscore>=350 && cibilscore<=450)														//maxamoumnt will be issue
			{
				 maxamount = (int) ( loanamount * 0.5);
			}
			else if(cibilscore>=451 && cibilscore<=550)
			{
				 maxamount = (int) ( loanamount * 0.6);
			}
			else if(cibilscore>=551 && cibilscore<=650)
			{
				 maxamount = (int) ( loanamount * 0.7);
			}
			else if(cibilscore>=651 && cibilscore<=750)
			{
				 maxamount = (int) ( loanamount * 0.7);
			}
			else if(cibilscore>=651 && cibilscore<=750)
			{
				 maxamount = (int) ( loanamount * 0.8);
			}
			else if(cibilscore>=751 && cibilscore<=850)
			{
				 maxamount = (int) ( loanamount * 0.9);
			}
			else if(cibilscore>=851 && cibilscore<=900)
			{
				 maxamount = (int) (loanamount * 1);
			}
			System.out.println();
			System.out.println("Based on details you entered you are eligible to get a amount of :" +  maxamount + "/-");
			System.out.println();
			System.out.println("=============================================================================================");
		}
	}
	void intcal() throws InterruptedException
	{
		System.out.println("Intrest rates for respective month duration given below & enter suitable number");
		System.out.println("3 months duration = 2%" + "  ==> enter 3");
		System.out.println("4 months duration = 2.5%" + "  ==> enter 4");
		System.out.println("5 months duration = 3%" + "  ==> enter 5");
		System.out.println("6 months duration = 3.5%" + "  ==> enter 6");
		System.out.println("7 months duration = 4%" + "  ==> enter 7");
		System.out.println("8 months duration = 4.5%" + "  ==> enter 8" );
		System.out.println("9 months duration = 5%" + "  ==> enter 9" );
		System.out.println("10 months duration = 5.5%" + "  ==> enter 10" );
		System.out.println("11 months duration = 6%"+ "  ==> enter 11");
		System.out.println("12 months duration = 6.5%"+ "  ==> enter 12");
		System.out.println("===============================================");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the duration required to repay the loan with intrest");
		System.out.println("==========================================================");
		dur =scan.nextInt();
		{
			if(dur>=3 && dur<=12)
				{
					System.out.print("");
				}
			else
			{
					do
					{
						System.out.println("Entered duration number is wrong please reenter correct corressponding number");
						System.out.println("===============================================================================");
						dur1 =scan.nextInt();
					}
					while(dur1<3 || dur1>12);
					dur = dur1;
					
			}
		}
	
				{									//initialize loan rates to amount
					if (dur == 3)
						{
							a = 0.02f;
							intr = a;
						}
					else if (dur == 4)
					{
						b = 0.025f;
						intr = b;
					}
					else if (dur == 5)
					{
						c = 0.03f;
						intr = c;
					}
					else if (dur == 6)
					{
						d = 0.035f;
						intr = d;
					}
					else if (dur == 7)
					{
						e = 0.04f;
						intr = e;
					}
					else if (dur == 8)
					{
						f = 0.045f;
						intr = f;
					}
					else if (dur == 9)
					{
						g = 0.05f;
						intr = g;
					}
					else if (dur == 10)
					{
						h = 0.055f;
						intr = h;
					}
					else if (dur == 11)
					{
						i = 0.06f;
						intr = i;
					}
					else if (dur == 12)
					{
						j = 0.065f;
						intr = j;
					}
				}
		System.out.println("Calculating the total amount & EMI amount please wait a second!");
		System.out.println("=============================================================================================");
		
		Thread.sleep(4000);			
		emiamount = (((maxamount) + (maxamount*intr))/dur);
		finalloanamount = (emiamount * dur);
		System.out.println();
		System.out.println("Total repayment loan amount with intrest is "+ finalloanamount + "/-");	
		System.out.println("Monthly EMI amount is " + emiamount + " /-");	
		
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("Check EMI & Total amount then enter any one option below");	
		System.out.println("for further processes ==> Enter 1");
		System.out.println("else ==> Enter 2");	
		System.out.println("============================================================================");
		System.out.println();
		
		System.out.println("Please enter your option");
		opt =scan.nextInt();
		
		if(opt<1 || opt>2)
		do
			{
				System.out.println("Please reenter your option");
				opt =scan.nextInt();
			}
			while(opt<1 || opt>2);
		if(opt==1)
		{
			System.out.println("Thank you please enter further bank details correctly");
		}
		else
		{
			System.out.println("Thankyou! Bye");
			System.exit(0);
		}
	}
	@Override
	void log() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void bank() {
		// TODO Auto-generated method stub
		
	}	
}

class bankinfo extends loan
{
	void bank() throws InterruptedException
	{
		 String Bankname, IFSCNO;
		 long accno;
		 
		 System.out.println("============================================================================");
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please enter the your bank name");
		 Bankname =scan.next();
		 System.out.println("Please enter the your bank IFSC Number");
		 IFSCNO =scan.next();
		 System.out.println("Please enter the your bank Account number");
		 accno =scan.nextInt();
		 System.out.println("============================================================================");
		 System.out.println("Thank you wait a minute we will credit the amount to your bank account & let you know");
		 try 
		 {
			Thread.sleep(5000);
		 } 
		 finally
		 {
			 System.out.println();
			 System.out.println("Amount credited! Please repay loan amount within the given time");
			 System.out.println("All the processes completed!");
			 System.out.println("=================================================================");
			 System.exit(0);
		 }
		
	}
	@Override
	void log() {	
	}

	@Override
	void customer() {
	}

	@Override
	void disp1() throws InterruptedException {
	}

	@Override
	void intcal() throws InterruptedException {

	}
}

class homeLoan 
{	
	void homeLoanIssue() throws InterruptedException 
	{
	System.out.println("Welcome to the Home loan application");
	System.out.println();
	cifc ci = new cifc();			// try & catch implement because input may vary
	ci.customer();		
	ci.disp1();
	ci.intcal();
		
	bankinfo bi = new bankinfo();
	bi.bank();
	
	}	
}
class personalLoan
	{
	
		void perLoan() throws InterruptedException 
		{
		
		System.out.println("Welcome to the Home loan application");
		System.out.println();
		cifc ci = new cifc();			// try & catch implement because input may vary
		ci.customer();		
		ci.disp1();
		ci.intcal();
		
		bankinfo bi = new bankinfo();
		bi.bank();
		}
	}

class goldLoan
{
	float finalloanamount,emiamount,intr, a,b,c,d,e,f,g,h,i,j;
	int  dur, dur1, opt,opt1,gw, conNum, maxamount;
	
	void gold() throws InterruptedException 
	{
		System.out.println("============================================================================");
		System.out.println("Welcome to the Gold loan application");
		cifc ci = new cifc();			
		ci.customer();
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter the gold weight you have (enter in grams)");
	    gw =scan.nextInt();
	    System.out.println("============================================================================");
	   
	    {
		    if (gw > 0)
		    {
		    	System.out.print("");
		    }
		    else
		    {
			    do
			    	{
			    	System.out.println("Wrong input please reenter the gold weight you have (enter in grams)");
			    	gw =scan.nextInt();
			    	}
			    	while(gw<1);
		    }
	    }
	    
	    if (gw > 100)
	    {
	    	System.out.println("Soory! we are not able to sanction loan over 100 grams & Thank you for showing interest with us!");
	    	System.exit(0);
	    }
	    
	    System.out.println("Per gram of gold we provide 4500/-");
	    System.out.println("If you are ok ==> Enter 1");
	    System.out.println("else ==> Enter 2 ");
	    conNum =scan.nextInt();
	    
	    { 
	    if (conNum ==1 || conNum == 2)
		    {
		    	System.out.print("");
		    	
		    }
	    else
			{
	    		do 
	    		{
	    			System.out.println("Wrong input please reenter the option correctly");
	    			conNum =scan.nextInt();
	    		}
	    		while(conNum <1 || conNum >2 );
			}
	    }
	    
	    {
	    	if(conNum == 1)
	    	{
	    		System.out.println("=======================================================");
	    		System.out.println("Please wait! we will calculate loan amount");
		    	Thread.sleep(4000);
		    	maxamount = gw * 4500 ;
		    	System.out.println("you are eligible for a loan amount of : " + maxamount+"/-");
		    	System.out.println("=======================================================");
		    	Thread.sleep(2000);
	    	}
	    	else
	    	{
	    		System.out.println("Thank you for showing interest with us! Process completed");
	    		System.exit(0);
	    	}
	    }
	}
		void intrest() throws InterruptedException 
		{
			System.out.println("Intrest rates for respective month duration given below & enter suitable number");
			System.out.println("3 months duration = 2%" + "  ==> enter 3");
			System.out.println("4 months duration = 2.5%" + "  ==> enter 4");
			System.out.println("5 months duration = 3%" + "  ==> enter 5");
			System.out.println("6 months duration = 3.5%" + "  ==> enter 6");
			System.out.println("7 months duration = 4%" + "  ==> enter 7");
			System.out.println("8 months duration = 4.5%" + "  ==> enter 8" );
			System.out.println("9 months duration = 5%" + "  ==> enter 9" );
			System.out.println("10 months duration = 5.5%" + "  ==> enter 10" );
			System.out.println("11 months duration = 6%"+ "  ==> enter 11");
			System.out.println("12 months duration = 6.5%"+ "  ==> enter 12");
			System.out.println("===============================================");
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the duration required to repay the loan with intrest");
			System.out.println("==========================================================");
			dur =scan.nextInt();
			{
				if(dur>=3 && dur<=12)
					{
						System.out.print("");
					}
				else
				{
						do
						{
							System.out.println("Entered duration number is wrong please reenter correct corressponding number");
							System.out.println("===============================================================================");
							dur1 =scan.nextInt();
						}
						while(dur1<3 || dur1>12);
						dur = dur1;
						
				}
			}
		
					{									//initialize loan rates to amount
						if (dur == 3)
							{
								a = 0.02f;
								intr = a;
							}
						else if (dur == 4)
						{
							b = 0.025f;
							intr = b;
						}
						else if (dur == 5)
						{
							c = 0.03f;
							intr = c;
						}
						else if (dur == 6)
						{
							d = 0.035f;
							intr = d;
						}
						else if (dur == 7)
						{
							e = 0.04f;
							intr = e;
						}
						else if (dur == 8)
						{
							f = 0.045f;
							intr = f;
						}
						else if (dur == 9)
						{
							g = 0.05f;
							intr = g;
						}
						else if (dur == 10)
						{
							h = 0.055f;
							intr = h;
						}
						else if (dur == 11)
						{
							i = 0.06f;
							intr = i;
						}
						else if (dur == 12)
						{
							j = 0.065f;
							intr = j;
						}
					}
			System.out.println("Calculating the total amount & EMI amount please wait a second!");
			System.out.println("============================================================================");
			System.out.println();
			Thread.sleep(4000);		
			System.out.println("max amount is " + maxamount );
			emiamount = (((maxamount) + (maxamount*intr))/dur);
			finalloanamount = (emiamount * dur);
		
			System.out.println("Total repayment loan amount with intrest is "+ finalloanamount + "/-");	
			System.out.println("Monthly EMI amount is " + emiamount + " /-");	
			
			System.out.println();
			System.out.println("============================================================================");
			System.out.println("Check EMI & Total amount then enter any one option below");	
			System.out.println("for further processes ==> Enter 1");
			System.out.println("else ==> Enter 2");	
			System.out.println("============================================================================");
			System.out.println();
			
			System.out.println("Please enter your option");
			opt =scan.nextInt();
			
			if(opt<1 || opt>2)
			do
				{
					System.out.println("Please reenter your option");
					opt =scan.nextInt();
				}
				while(opt<1 || opt>2);
			if(opt==1)
			{
				System.out.println("Thank you please enter further bank details correctly");
			}
			else
			{
				System.out.println("Thankyou! Bye");
				System.exit(0);
			}
			bankinfo bi = new bankinfo();
			bi.bank();
		}
		
	} 

public class WelcomeNote {

	public static void main(String[] args) throws InterruptedException {

		System.out.println();
		System.out.println();
		System.out.println(" 						           		Welcome to the ABC Finance Limited");
		System.out.println("============================================================================================================================================================================================================================");
		System.out.println();
		
		try 
		{
				Thread.sleep(3000);
				login lg = new login();
				lg.log();			
				
				System.out.println();
				System.out.println();
				System.out.println("Different type of loan offering ::");
				System.out.println();
				System.out.println("(1) HOME LOAN to get home loan enter 1");
				System.out.println("(2) PERSONAL LOAN to get personal loan enter 2");
				System.out.println("(3) GOLD LOAN to get gold loan enter 3");
				System.out.println("======================================================================================================");
				
				int Ci,Cii;
				Scanner scan=new Scanner(System.in);
				System.out.println("Customer please enter the suitable value to get desired type of loan");
				System.out.println("=====================================================================");
				Ci=scan.nextInt();
				
				if(Ci>=1 && Ci<=3)
				{
					System.out.print("");
				}
				else
				{
					{
					do { 
						System.out.println("You entered wrong input please reenter the value from 1 to 3");	
						System.out.println("=============================================================");
						Cii=scan.nextInt();
						}
						while((Cii != 1) && (Cii != 2) &&  (Cii != 3));
						Ci = Cii;
					}		
				}
				System.out.println();
				
				if(Ci==1)
				{
					homeLoan h1 = new homeLoan();
					h1.homeLoanIssue();
				}
				else if(Ci == 2)
				{
					personalLoan pl = new personalLoan();
					pl.perLoan();
				}
				else if(Ci == 3)
				{
					goldLoan gl = new goldLoan();
					gl.gold();
					gl.intrest();
				}
		}
		finally
		{
			System.out.println("You entered invalid input please rerun the page");
			System.exit(0);
		}
	}
}




