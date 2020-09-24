import java.util.Scanner;
class Q15{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter sex: M/F");
		int sex = sc.next().charAt(0);
		
		
		
		
			if((age >= 20) && (age < 40)) {
				System.out.println("You are eligible for marriage");
			}
			else if((age >= 40) && (age < 60)) {
				System.out.println("You are not eligible");
			}
			
		
	}
}