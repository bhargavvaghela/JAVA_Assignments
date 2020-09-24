import java.util.Scanner;

class Person{
	 String name;
	 int age = 18;

	Person(String a,int b){
		this.name = a;
		this.age = b;
		 
	}

	Person(){
		System.out.println("simplewala");
	}

	 void display(){
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}



}


class Q37{
	public static void main(String[] args) {
		Person p1 = new Person("Bhargav",25);
		p1.display();

	}
}