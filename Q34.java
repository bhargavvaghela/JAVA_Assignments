import java.util.Scanner;

class circle{
	private int radius;
	private double area;


	Scanner sc = new Scanner(System.in);

	void get(){
		System.out.println("Enter the radius");
		radius = sc.nextInt();

	}

	void CalcArea(){
		 area =(double) radius*radius*(22/7);

	}

	void display(){
		System.out.println("Radius = "+radius);
		System.out.println("Area of circle =  "+area);
	}
}


class Q34{
	public static void main(String[] args) {
		circle c1 = new circle();
		c1.get();
		c1.CalcArea();
		c1.display();
	}
}