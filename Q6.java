import java.util.Scanner;
class Q6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");

		int r = sc.nextInt();
		double circumference =(double) 2*r*(22/7);

		double area =(double) r*r*(22/7);

		System.out.println("circumference = "+circumference);
		System.out.println("area = "+area);
	}
}