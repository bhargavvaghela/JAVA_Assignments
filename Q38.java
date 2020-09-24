import java.util.Scanner;

class Employee{
	private int empNo;
	private int salary;
	static int totalSalary = 0;


	static int totalEmp = 0;

	Employee(int a,int b){
		this.empNo = a;
		this.salary = b;
		this.totalSalary += salary;
		
		totalEmp++;
	}

	static void display(){
		System.out.println("Total Number of employees :"+totalEmp);
		System.out.println("Total of their salaries :"+totalSalary);
	}
}

class Q38{
	public static void main(String[] args) {
		Employee e1 = new Employee(1,10000);
		Employee e2 = new Employee(2,15000);
		Employee e3 = new Employee(3,30000);
		e3.display();

		
	}
}