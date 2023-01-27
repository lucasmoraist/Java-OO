
public class testaValores {
	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.setAgencia(1233);
		c.setNumero(220);
		
		System.out.println(c.getAgencia());
		
		Conta a = new Conta();
		a.setAgencia(2040);
		a.setNumero(310);
		
		System.out.println(Conta.getTotal());
		
	}
}
