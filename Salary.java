import java.util.Scanner;
class Employee{
	int empNo;
	String name;
	double basicpay;
	
	Employee(int empNo,String name,double basicpay)
	{
		this.empNo=empNo;
		this.name=name;
		this.basicpay=basicpay;
	}
	
	double grossSalary()
	{
		double DA,HA,grossSalary;
		DA=0.2*basicpay;
		HA=0.005*basicpay;
		grossSalary=basicpay+DA+HA;
		return grossSalary;
	}
	
	void Show()
	{
		System.out.println("Name: "+name+", Employee ID: "+empNo+", Basic pay: "+basicpay );
	}
	
}
class Details_57{
	public static void main(String args[])
	{
		Employee e[]=new Employee[5];
		int n,i,employeeNo;
		double pay;
		String username;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		n=s.nextInt();
		
		for(i=0;i<n;i++)
		{
			username=s.nextLine();
			System.out.println("Enter the name of the employee");
			username=s.nextLine();
			System.out.println("Enter the employee ID");
			employeeNo=s.nextInt();
			System.out.println("Enter the basic pay");
			pay=s.nextDouble();
			e[i]=new Employee(employeeNo,username,pay);
			
		}
		for(i=0;i<n;i++)
		{
			e[i].Show();
			System.out.println("Gross Salary: "+e[i].grossSalary());
		}
	}
}
		
			
			
			
			
