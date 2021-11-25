package tp;

public class ErrM extends Errop{

	public ErrM(int n1, int n2) {
		super(n1, n2);
	}
	
	public void printMessage() {
		System.out.println("It is not possible to make a multiplication between " + n1+ "  and " + n2);
	}
}
