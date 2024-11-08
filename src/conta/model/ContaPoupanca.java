package conta.model;

public class ContaPoupanca extends Conta{
	
	int aniversario;
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}
	
	//getters e setters
	public int getAniversario() {
		return aniversario;
	}
	
	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	//metodos
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversario da Conta: " + this.aniversario);
	}
}
