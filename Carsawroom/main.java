package Carsawroom;

import java.util.Scanner;

interface utility{
    public void get_details();
    public void set_details();
  
}
public class main  {
	
	 
	
	public static void main(String args[])
	{
		int size,i;
		 int choice;
		 int empno=0;
		 int empcar=0;
		// int emp[] = new int[empno];
		 Addcar employees1[] = null;
		  Addemp employees[] = null;
			
		while(true)
		{
		
		
			
		System.out.println("Wellcome for Drive Sawroom: ");
		System.out.println("1>add employees");
		System.out.println("2>add Car");
		System.out.println("3>Get employees :");
		System.out.println("4>Get Car:");
		System.out.println("5>Display Today Sell ");
		System.out.println("6>EXIT ");

		
		
		
		System.out.println("please chose the currect option:");
		Scanner sc = new Scanner( System.in);
		   choice = sc.nextInt();
		
		 switch(choice)
		 {
		 
		
		 case 1:
			// Addemp();
			// Addemp add = new Addemp();
//			 Scanner sc = new Scanner( System.in);
			 System.out.println("how many employees add:");
			 empno = sc.nextInt();
			 sc.nextLine();
			  employees = new Addemp[empno];
				
			 for(i=0;i<employees.length;i++)
			 {
				 employees[i] = new Addemp();
                 employees[i].set_details();
			 }
			  break;
			  
		 case 2:
			 System.out.println("how many car:");
			 empcar = sc.nextInt();
			 sc.nextLine();
			  employees1 = new Addcar[empcar];
				
			 for(i=0;i<employees1.length;i++)
			 {
				 employees1[i] = new Addcar();
                 employees1[i].set_details();
			 }
			  break;
			  
		 case 3:
			 if (employees == null) {
                 System.out.println("No employees to display. add employees..");
             } else {
                 for (i = 0; i < employees.length; i++) {
                     employees[i].get_details();
                 }
             }
             break;
             
		 case 4:
			 if (employees1 == null) {
                 System.out.println("No car to display. add car..");
             } else {
                 for (i = 0; i < employees1.length; i++) {
                     employees1[i].get_details();
                 }
             }
             break;
			 
			 
		 case 6:
			System.exit(0);
			 
		 }
		
		}// while end
	}   //main method end

	
	
}  //class main end


