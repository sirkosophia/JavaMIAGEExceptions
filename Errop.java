package tp;

public abstract class Errop extends Exception{
	protected final int n1; 
	protected final int n2;
	
	public Errop(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public abstract void printMessage();

}
