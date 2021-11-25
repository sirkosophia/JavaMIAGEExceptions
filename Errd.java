package tp;



public class Errd extends Errop{

	public Errd(int n1, int n2) {
		super(n1, n2);
	}
	
	public void printMessage() {
		System.out.println("It is not possible to substract " + n1+ "  and " + n2);
	}
}
