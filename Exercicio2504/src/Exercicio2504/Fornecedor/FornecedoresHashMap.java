package Exercicio2504.Fornecedor;

import java.util.HashMap;

public class FornecedoresHashMap {
	HashMap<Integer, Fornecedor> fornecedores = new HashMap<Integer, Fornecedor>();
	public void adicionar(Fornecedor fornecedor){
		this.fornecedores.put(fornecedor.getCodigo(), fornecedor);
	}
	
	public boolean remover(int codigo) throws FornecedorNaoExisteException{
		if(!this.fornecedores.containsKey(codigo)){
			throw new FornecedorNaoExisteException();
		}
		this.fornecedores.remove(codigo);
		return false;
	}
	public boolean remover(Fornecedor fornecedor) throws FornecedorNaoExisteException{
		if(!this.fornecedores.containsKey(fornecedor.getCodigo())){
			throw new FornecedorNaoExisteException();
		}
		this.fornecedores.remove(fornecedor.getCodigo());
		return true;
	}
	public void printMap(){
		for(int i = 1; i <= this.fornecedores.size(); i++){
			System.out.println(this.fornecedores.get(i).toString());
		}
	}
	public Fornecedor procurar(int codigo) throws FornecedorNaoExisteException{
		if(!this.fornecedores.containsKey(codigo)){
			throw new FornecedorNaoExisteException();
		}
		return this.fornecedores.get(codigo); 
	}
	
	public Fornecedor procurar(Fornecedor fornecedor) throws FornecedorNaoExisteException{
		if(!this.fornecedores.containsKey(fornecedor.getCodigo())){
			throw new FornecedorNaoExisteException();
		}
		return this.fornecedores.get(fornecedor.getCodigo());
	}
}
