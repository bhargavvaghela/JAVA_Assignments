import java.util.Scanner;

class MathOperation{
	static int addition(int a, int b){
		
		return a+b;
	}

	static int diff(int a,int b){
		
		return a-b;
	}

	static int multi(int a,int b){
		
		return a*b;
	}

	static long power(int a,int b){
		int base = a, exponent = b;

        long result = 1;

        for (;exponent != 0; --exponent)
        {
            result *= base;
        }
        System.out.println("power = "+result);
        return result;
	}
}


class Q35{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First number :");
		int x = sc.nextInt();
		System.out.println("Enter second number :");
		int y = sc.nextInt();

		MathOperation m1 = new MathOperation();
		int a = m1.addition(x,y);
		System.out.println(a)
		m1.diff(x,y);
		m1.multi(x,y);
		m1.power(x,y);

	}
}