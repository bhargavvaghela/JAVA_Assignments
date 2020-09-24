import java.util.Scanner;
class Product{
	public int pid;
	public int price;
	public int quantity;

	Product(int a,int b, int c){
		this.pid = a;
		this.price = b;
		this.quantity = c;

	}


}

class Q39{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of product you want to enter values :");

		int n = sc.nextInt();
		Product[] obj = new Product[n];
		
		for(int i=0;i<n;i++){
			System.out.println("Enter Pid :");
			int a = sc.nextInt();
			System.out.println("Enter price :");
			int b = sc.nextInt();
			
			System.out.println("Enter quantity :");
			int c = sc.nextInt();
			
			obj[i] = new Product(a,b,c);


		}

		System.out.println("Product with highest price = ");
	}
}