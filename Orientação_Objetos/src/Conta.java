public class Conta {
	double saldo;
	int agencia = 22222;
	int numero = 10;
	Cliente titular;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("\nSaque concluido\n");
			return true;
		} else {
			System.out.println("\nValor insuficiente\n");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			//destino.saldo += valor;
			destino.depositar(valor);
			System.out.println("\nTransferencia concluida\n");
			return true;
		} else {
			System.out.println("\nValor insuficiente\n");
			return false;
		}
	}
}
