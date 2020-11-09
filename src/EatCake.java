
public class EatCake {
	public EatCake() {
		
	}
	
	public static void eatCake(Cake cake) {
		if(!cake.isEmpty()) {
			cake.takeABite();
			eatCake(cake);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake cake = new Cake();
		eatCake(cake);
		System.out.println("Done eating cake - ready to go back to Java2!!!");
	}

}
