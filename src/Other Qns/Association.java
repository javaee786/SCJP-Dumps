import java.util.Scanner;
class Bank{
	private String name;
	Bank(String name){
		this.name=name;
	}
	public String getBankName(){
		return this.name;
	}
}

class Employee{
	private String name;
	Employee(String name){
		this.name=name;
	}
	public String getEmployeeName(){
		return this.name=name;
	}
}

public class Association{
	public static void main(String[] args){
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Bank Name: ");
		String bankname=sc1.next();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String empname=sc2.next();
		
		Bank bank=new Bank(bankname);
		Employee emp=new Employee(empname);
		
		
		System.out.println();
		System.out.println(emp.getEmployeeName()+" is employee of: "+bank.getBankName()+" Bank");
		
	}	
}

