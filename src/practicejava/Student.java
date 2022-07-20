package practicejava;

public class Student {

	int SID;
	String Sname;
	int sub1;
	int sub2;
	int sub3;
	void getStuData(int SID, String Sname) {
		System.out.println(SID);
		System.out.println(Sname);
		
	}
	void getStuMarks(int sub1,int sub2,int sub3) {
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		
	}
	void totalMarks(int SID, String Sname,int sub1,int sub2,int sub3) {
		System.out.println(SID);
		System.out.println(Sname);
		System.out.println("Total Marks="+(sub1+sub2+sub3));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student stud = new Student();
      stud.getStuData(101, "John");
      stud.getStuMarks(80, 70, 50);
      stud.totalMarks(101, "John", 80, 70, 50);
		
	}

}
