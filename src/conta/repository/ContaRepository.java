package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	
	//CRUD
	public void cadastrar(Conta conta); //Create
	public void listarTodas(); //Read
	public void procurarPorNumero(int numero);// Read
	public void atualizar(Conta conta); //Update
	public void deletar(int numero); // Delete
	
	//Métodos Bancarios
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDeposito, float valor);
	
}
