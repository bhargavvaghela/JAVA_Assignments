class Q3{
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;

		int a = (x*x) + 3*x - 7;
		System.out.println("y ="+a);

		int b = x++ + ++x;
		System.out.println("x = "+x+ "y = "+b);


		int c = x++ - --y - --x + x++;
		System.out.println("x= "+x+ " y = "+y+ " z = "+c);
	}
}