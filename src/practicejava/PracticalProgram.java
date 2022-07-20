package practicejava;

public class PracticalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PracticalProgram pp = new PracticalProgram();
      pp.PrintName();
      pp.SumtwoNum();
      pp.Swaptwonum();
	}

	public void PrintName() {
		System.out.print("Hello ");
		System.out.println("Guru");
	}
	public void SumtwoNum() {
		int a=10;
		int b=20;
		System.out.println("SUM : "+(a+b));
	}
	public void Swaptwonum() {
		int a=25;
		int b=10;
		int c=a;
		a=a+b;   //a=35
		b=a-b;   //35-10=25;b=25;
		a=a-b;   //35-25=10;
		System.out.println(a);
		System.out.println(b);
		
	}
}
