package tp;

public class Nat {
	
	private int n;
	
	public Nat(int val) throws ErrConst{
		if (val<0) {
			throw new ErrConst("La valeur doit etre positive mais elle est" + val);	
		}
		else {
			this.n = val;
		}
	}
	
	public int getN() {
		return n;
	}

	public static Nat somme(Nat n1, Nat n2) throws ErrS, ErrConst{
		long s = (long) n1.getN() + (long)n2.getN();
		if (s>Integer.MAX_VALUE) {
			throw new ErrS(n1.getN(), n2.getN());
		}
		return new Nat(n1.getN() + n2.getN());
	}
	
	public static Nat diff(Nat n1, Nat n2)throws ErrConst, Errd{
		int s = n1.getN() - n2.getN();
		if (s<0) {
			throw new Errd(n1.getN(), n2.getN());
		}
		return new Nat(n1.getN() - n2.getN());
	}
	
	public static Nat multiply(Nat n1, Nat n2) throws ErrM, ErrConst{
		long s = (long) n1.getN() * (long)n2.getN();
		if (s>Integer.MAX_VALUE) {
			throw new ErrM(n1.getN(), n2.getN());
		}
		return new Nat(n1.getN() * n2.getN());
	}

}
