
public class teste {

	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		
		lucas.nome ="Lucas de Morais";
		lucas.cpf ="44455599912";
		lucas.profissao="t.i";
		
		Conta contaLucas = new Conta();
		contaLucas.saldo = 400;
		contaLucas.titular = lucas;
		
		System.out.println(contaLucas.titular.nome);
		System.out.println(contaLucas.titular);
				
	}

}
