package practicejava;

public class Calculation {

	int a;
	int b;
	int c;
	Calculation(){
		a=10;
		b=20;
		c=20;
	}
	Calculation(int x,int y,int z){
		a=x;
		b=y;
		c=z;
	}
	void sum() {
		System.out.println(a+b+c);
	}
	void add() {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Calculation calc = new Calculation();
//      calc.sum();
      Calculation calcu = new Calculation(100, 20, 20);
      calcu.add();
	}

}
