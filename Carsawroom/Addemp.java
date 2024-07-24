package Carsawroom;

import java.util.Scanner;

public class Addemp  implements utility {
	 String emp_id;
	 int empno;
	 int i;
	    String emp_name;
	    String showroom_name;
	    int emp_age;
	    String emp_department;
	    int eid ;
//	  
	
	 public  void get_details()
	 {
		
		 
			 	System.out.println("ID: "+ i+1);
		        System.out.println("Name: "+emp_name);
		        System.out.println("Age: "+emp_age);
		        System.out.println("Department: "+emp_department);
		        System.out.println("Showroom Name: "+showroom_name);
		      //  eid = eid+1;
	 }
	 
	 
	 
	 public void set_details()
	 {
		 
		Scanner sc = new Scanner( System.in);
		// size=empno;
		
		
		
		
			System.out.println("Enter a name:");
				emp_name = sc.nextLine();
//			System.out.println("");
			 sc.nextLine();
			
			 System.out.print(("EMPLOYEE AGE: "));
		         emp_age = sc.nextInt();
		        sc.nextLine();
//		        sc.nextLine();/
		        System.out.print("EMPLOYEE DEPARTMENT: ");
		         emp_department = sc.nextLine();
		        System.out.print("SHOWROOM NAME: ");
		         showroom_name = sc.nextLine();
		}
		 
	 }


