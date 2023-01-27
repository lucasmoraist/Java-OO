
public class teste {

	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		
		lucas.setNome("Lucas de Morais");
		lucas.setCpf("44455599912");
		lucas.setProfissao("t.i");
		
		Conta contaLucas = new Conta();
		contaLucas.setSaldo(400);
		contaLucas.setTitular(lucas);
		
		System.out.println(contaLucas.getTitular().getNome());
		System.out.println(contaLucas.getTitular());
				
	}

}
