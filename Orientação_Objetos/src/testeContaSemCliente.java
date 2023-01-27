public class testeContaSemCliente {
	public static void main(String[] args) {
		Conta contaLucas = new Conta();
		
		contaLucas.setTitular(new Cliente());
		
		contaLucas.getTitular().setNome("Lucas de Morais");
		
		System.out.println(contaLucas.getTitular());
		System.out.println(contaLucas.getTitular().getNome());
	}
}
