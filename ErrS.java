package tp;



public class ErrS extends Errop{

	public ErrS(int n1, int n2) {
		super(n1, n2);
	}
	
	public void printMessage() {
		System.out.println("It is not possible to add " + n1+ "  and " + n2);
	}
}
