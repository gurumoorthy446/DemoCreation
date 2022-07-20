package practicejava;

public class Swapnumtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  x=10;
		int y=20;
//		//using third variable
//		int t;
//		t=x;  //10=t
//		x=y;   //20=x
//		y=t;    //10=y
//		System.out.println(x);
//		System.out.println(y);
		//without using third variable
		x=x+y;  //30=x
		y=x-y;  //10=y
		x=x-y;
		System.out.println("Without using third variable: "+x);
		System.out.println("Without using third variable: "+y);
	}

}
