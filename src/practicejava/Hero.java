package practicejava;

public class Hero extends Abstarctiondemo {

	@Override
	public void gear() {
		System.out.println("Five gears available");// TODO Auto-generated method stub
		
	}
      public void Engine() {
    	  System.out.println("Hero technology");
      }
      public static void main(String[] args) {
		Hero hero = new Hero();
		hero.gear();
		hero.Engine();
	}
}