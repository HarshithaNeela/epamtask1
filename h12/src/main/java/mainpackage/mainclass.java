package mainpackage;
import java.io.*;
import java.util.*;

import operationspackage.operations;


public class mainclass
{
	public static void main(String args[])
	{
		int n,c;
		Scanner s=new Scanner(System.in);
	    System.out.println("enter the area");
	    n=s.nextInt();
	    System.out.println("choose rate per square feet \n 1.1200inr if stardard material \n 2.1550inr if we use above standard materials \n 3.1800inr if customers needs high standard materials \n 4.2500inr if customer needs high standard materials and fully automated home  ");
	c=s.nextInt();
	switch(c)
	{
	case 1:System.out.println(operations.getAppdata().f1200(n));break; 
	case 2:System.out.println(operations.getAppdata().f1500(n));break; 
	case 3:System.out.println(operations.getAppdata().f1800(n));break; 
    case 4:System.out.println(operations.getAppdata().f2500(n));break; 
    default:
    	System.out.println("wrong choice");

	}
	}


}
