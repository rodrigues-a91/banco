package banco;

public class Cliente {
	private int numeroConta;
	private String nome;
	private float saldo;
	private byte tipo;
	private String tipoDescricao;
	
	public Cliente(int numeroConta, String nome, float saldo, byte tipo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
		this.tipo = tipo;
		this.setTipoDescricao((tipo == 1)?"Especial":"Comum");
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public byte getTipo() {
		return tipo;
	}

	public void setTipo(byte tipo) {
		this.tipo = tipo;
	}

	public String getTipoDescricao() {
		return tipoDescricao;
	}

	public void setTipoDescricao(String tipoDescricao) {
		this.tipoDescricao = tipoDescricao;
	}
	
	
	
}
