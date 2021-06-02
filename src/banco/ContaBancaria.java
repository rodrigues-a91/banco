package banco;

public class ContaBancaria {

	private Cliente[] clientes;
	private int contador;

	public ContaBancaria(int qtdClientes) {
		this.contador = 0;
		this.clientes = new Cliente[qtdClientes];

	}

	public void adicionarClientes(Cliente novoCliente) {
		this.clientes[contador] = novoCliente;
		this.contador++;
	}

	public void deposito(int numeroDaContaInformada, float valorASerDepositado) {
		Cliente conta = procurarCliente(numeroDaContaInformada);

		if (conta != null) {
			float saldo = conta.getSaldo();
			float novoSaldo = saldo + valorASerDepositado;
			conta.setSaldo(novoSaldo);
			System.out.println("Deposito feito com sucesso");
		} else {
			System.out.println("O numero da conta bancaria informada não foi encontrada");

		}

	}

	public void saque(int numeroDaContaInformada, float valorASerSacado) {
		Cliente conta = procurarCliente(numeroDaContaInformada);

		if (conta != null) {
			float saldoAtual = conta.getSaldo();
			if (saldoAtual < valorASerSacado) {
				System.out.println("Saldo insuficiente");
			} else {
				float novoSaldo = saldoAtual - valorASerSacado;
				conta.setSaldo(novoSaldo);
				System.out.println("Saque feito com sucesso");
			}

		} else {
			System.out.println("O numero da conta bancaria informada não foi encontrada");
		}

	}

	public void extratoBancario(int numeroDaContaInformada) {
		Cliente conta = procurarCliente(numeroDaContaInformada);
		if (conta != null) {
			System.out.println("Numero da conta: " + conta.getNumeroConta());
			System.out.println("Nome do cliente: " + conta.getNome());
			System.out.println("Saldo: " + conta.getSaldo());
			System.out.println("Tipo da Conta: " + conta.getTipoDescricao());
		} else {
			System.out.println("O numero da conta bancaria informada não foi encontrada");
		}
	}

	private Cliente procurarCliente(int numeroDaContaInformada) {
		for (int i = 0; i < contador; i++) {
			Cliente cliente = clientes[i];
			int numeroDaConta = cliente.getNumeroConta();

			if (numeroDaContaInformada == numeroDaConta) {
				return cliente;
			}
		}
		return null;

	}
}
