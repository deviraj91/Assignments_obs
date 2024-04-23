package assignment;

public class Assigninheritchild2 extends Assigninheritchild1 {

	public void print()
	{
		float total=basic+hra-ded-pf+bon;
		System.out.println("Salary Slip :: ");
	    System.out.println("1. Basic Pay : " + basic);
	    System.out.println("2. hra : " + hra);
	    System.out.println("3. pf : " + pf);
	    System.out.println("4. Deduction : " + ded);
	    System.out.println("5. Bonus: " + bon);
	    System.out.println("6. Total Salay : " + total);

	}
		
		

	public static void main(String[] args) {

		Assigninheritchild2 obj=new Assigninheritchild2();
		obj.getdetails();
		obj.calculation();
		obj.print();
		
		
		
		
        
	}

}
