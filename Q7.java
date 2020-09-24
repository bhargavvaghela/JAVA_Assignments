import java.util.Scanner;
class Q7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject cpp marks");
		float sub1 = sc.nextFloat();

		System.out.println("Enter subject ds marks");
		float sub2 = sc.nextFloat();

		System.out.println("Enter subject dbms marks");
		float sub3 = sc.nextFloat();

		System.out.println("Enter subject awp marks");
		float sub4 = sc.nextFloat();

		System.out.println("Enter subject meanstack marks");
		float sub5 = sc.nextFloat();

		
		float percentage = (float)((sub1+sub2+sub3+sub4+sub5)/500)*100;
		System.out.println("percentage = "+percentage+"%");
	}
}