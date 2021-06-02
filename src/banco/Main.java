package banco;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(1,"carlos",50,(byte) 1);
		Cliente c2 = new Cliente(2,"ana",250,(byte) 2);
		Cliente c3 = new Cliente(3,"alberto",0,(byte) 1);
		Cliente c4 = new Cliente(4,"vel",75,(byte) 2);
		
		ContaBancaria cb1 = new ContaBancaria(4);
		
		cb1.adicionarClientes(c1);
		cb1.adicionarClientes(c2);
		cb1.adicionarClientes(c3);
		cb1.adicionarClientes(c4);
		
		
		
		cb1.saque(2, 25f);
		cb1.deposito(3, 26f);
		cb1.extratoBancario(5);

	}

}
