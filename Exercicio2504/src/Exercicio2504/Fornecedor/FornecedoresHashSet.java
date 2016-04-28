package Exercicio2504.Fornecedor;

import java.util.HashSet;

public class FornecedoresHashSet {
	HashSet<Fornecedor> fornecedores = new HashSet<Fornecedor>();
	
	public void adicionar(Fornecedor fornecedor){
		this.fornecedores.add(fornecedor);
	}
	
	public boolean remover(int codigo)  throws FornecedorNaoExisteException{
		for(Fornecedor fornecedor : this.fornecedores){
			if(fornecedor.getCodigo() == codigo){
				this.fornecedores.remove(fornecedor);
				return true;
			}
		}
		throw new FornecedorNaoExisteException();
	}
	public boolean remover(Fornecedor fornecedor)  throws FornecedorNaoExisteException{
		if(!this.fornecedores.contains(fornecedor)){
			throw new FornecedorNaoExisteException();
		}
		return this.fornecedores.remove(fornecedor);
	}
	
	public void printSet(){
		for(Fornecedor fornecedor : this.fornecedores){
			System.out.println(fornecedor.toString());
		}
	}
	public Fornecedor procurar(int codigo)  throws FornecedorNaoExisteException{
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
		for(Fornecedor forn : this.fornecedores){
			if(forn.equals(fornecedor)){
				return forn;
			}
		}
		return null;
	}
}
