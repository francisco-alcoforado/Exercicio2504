package Exercicio2504.Fornecedor;


import java.util.ArrayList;

public class FornecedoresArrayList {
	private ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	public void adicionar(Fornecedor fornecedor){
		this.fornecedores.add(fornecedor);
	}
	public void printList(){
		for(Fornecedor fornecedor : this.fornecedores){
			System.out.println(fornecedor.toString());
		}
	}
	public boolean remover(Fornecedor fornecedor)  throws FornecedorNaoExisteException{
		int index = this.fornecedores.indexOf(fornecedor);
		if(index == -1){
			throw new FornecedorNaoExisteException();
		}
		this.fornecedores.remove(index);
		return true;
	}
	public boolean remover(int codigo) throws FornecedorNaoExisteException{
		for(Fornecedor fornecedor : this.fornecedores){
			if(fornecedor.getCodigo() == codigo){
				this.fornecedores.remove(fornecedor);
				return true;
			}
		}
		 throw new FornecedorNaoExisteException();
	}
	public Fornecedor procurar(int codigo) throws FornecedorNaoExisteException{
		for(Fornecedor fornecedor : this.fornecedores){
			if(fornecedor.getCodigo() == codigo){
				return fornecedor;
			}
		}
		throw new FornecedorNaoExisteException();
	}
	public Fornecedor procurar(Fornecedor fornecedor) throws FornecedorNaoExisteException{
		if(!this.fornecedores.contains(fornecedor)){
			throw new FornecedorNaoExisteException();
		}
		int index = this.fornecedores.indexOf(fornecedor);
		return this.fornecedores.get(index);
	}
}
