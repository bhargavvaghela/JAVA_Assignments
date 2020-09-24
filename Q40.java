import java.util.Scanner;

class Student{
	private String name;
	private int rollNo;
	private int age;
	private int score;

	String[] arr1 = new String[10];
	int[] arr2 = new int[10];
	int[] arr3 = new int[10];
	int[] arr4 = new int[10];

	int count1=0;
	int count2=0;
	int count3=0;
	int count4=0;
	

	void AddRecord(){

		for(int i=0;i<10;i++){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String a = sc.nextLine();
		this.name = a;
		arr1[i]=a;

		System.out.println("Enter roll no");
		int b = sc.nextInt();
		this.rollNo= b;
		arr2[i]=b;

		System.out.println("Enter age");
		int c = sc.nextInt();
		this.age= c;
		arr3[i]=c;


		System.out.println("Enter score");
		int d = sc.nextInt();
		this.score= d;
		arr4[i]=d;

		}

		
	}


	void arrangeRecord(){

		for(int i=0;i<10;i++){

			if(arr4[i]>0 && arr4[i]<=50){
				count1++;

			}
			else if(arr4[i]>=50 && arr4[i]<=65){
				count2++;
			}
			else if(arr4[i]>=65 && arr4[i]<=80){
				count3++;
			}
			else if(arr4[i]>=80 && arr4[i]<=100){
				count4++;
			}


		}
	}

	void displayRecord(){
		System.out.println("Total student with [0-50] = "+count1);
		System.out.println("Total student with [50-65] = "+count2);
		System.out.println("Total student with [65-80] = "+count3);

		System.out.println("Total student with [80-100] = "+count4);

	}	
}

class Q40{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.AddRecord();
		s1.arrangeRecord();
		s1.displayRecord();
	}
}