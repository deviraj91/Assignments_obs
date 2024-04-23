package assignment;

import java.util.Scanner;

public class Assigninheritpar {
	protected float basic;
	protected float ded;
	protected float bon;

	public void getdetails()
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the basic pay");
		 basic=obj.nextFloat();
		System.out.println("Enter the deduction");
		 ded=obj.nextFloat();
		System.out.println("Enter the bonus");
	    bon=obj.nextFloat();
	    //System.out.println(basic);
	
	
	
}

}


