public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //O static faz a função em que o total passe a ser da classe e não apenas do objeto
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode número menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode número menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public Conta() {
		Conta.total++;
	}
	
	public Conta(double saldo, int agencia,int numero,Cliente titular) {
		total++;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

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
