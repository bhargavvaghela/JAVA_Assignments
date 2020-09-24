class Q36{

	static void MathOP(int a,int b){
		int x = a*b;
		System.out.println(x);
	}

	static void MathOP(float a,float b,float c){
		float y = a*b*c;
		System.out.println(y);
	}

	static void MathOP(int[] intArray){
		
		int sum = 0;  

		for (int i = 0; i < intArray.length; i++) 
		{  
           sum = sum + intArray[i];  
        }  
        System.out.println(sum);
	}

	static void MathOP(double a,int b){
		double z = a*b;
		System.out.println(z);
	}

	public static void main(String[] args) {
		int arr[] ={1,2,3}; 
		MathOP(2,3);
		MathOP(2.0f,3.0f,4.0f);
		MathOP(arr);
		MathOP(10.0,2);
	}
}