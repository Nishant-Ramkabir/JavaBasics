package OOPS2;

public class Testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("$"+Usbank.bal);
		
		HSBCBank o = new HSBCBank();
		o.credit();
		o.debit();
		o.rules();
		o.statement();
	}

}
