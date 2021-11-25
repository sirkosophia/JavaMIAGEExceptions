package tp;

public class main {

	public static void main(String[] args) {
		try {
			Nat n1 = new Nat(10);
			Nat n2 = new Nat(20);
			Nat.diff(n1,n2);
		} catch (ErrConst e) {
			e.printStackTrace();
		} catch(Errop e) {
			e.printMessage();
		}

	}

}
