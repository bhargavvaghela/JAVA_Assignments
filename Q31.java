class Student{
	private int Rno;
	private String Name;
	void setData(int rno,String name){
		this.Rno = rno;
		this.Name = name;
	}
	void showData(){
		System.out.println(Rno+"  "+Name);
	}
}
class Q31{
	public static void main(String args[]){
	Student s = new Student();
	s.setData(27,"Bhargav");
	s.showData();
	}
}