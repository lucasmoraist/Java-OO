public class testeContaSemCliente {
	public static void main(String[] args) {
		Conta contaLucas = new Conta();
		
		contaLucas.titular = new Cliente();
		
		contaLucas.titular.nome = "Lucas de Morais";
		
		System.out.println(contaLucas.titular);
		System.out.println(contaLucas.titular.nome);
	}
}
