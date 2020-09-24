 class Student{
	 private int rno;
	 private String name;
	  static int count;
	 Student()
	 {
		 count++;
	 }
	 
	 void setData(int roll,String nm)
	 {
		 this.rno=roll;
		 this.name=nm;
	 }
	 void showData()
	 {
		 System.out.println("Roll no. is " +rno);
		 System.out.println("name is: " +name);
	 }
	 
	 
 }
 

	class Q32{
		public static void main(String ab[])
		{
			Student s1=new Student();
			s1.setData(27,"bhargav");
			s1.showData();
			Student s2=new Student();
			Student s3=new Student();
			System.out.println("Total object created = "+Student.count);
		}
	}