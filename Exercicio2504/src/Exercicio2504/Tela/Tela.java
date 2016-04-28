package Exercicio2504.Tela;

import Exercicio2504.Fornecedor.Fornecedor;
import Exercicio2504.Fornecedor.FornecedorNaoExisteException;
import Exercicio2504.Fornecedor.FornecedoresArrayList;
import Exercicio2504.Fornecedor.FornecedoresHashMap;
import Exercicio2504.Fornecedor.FornecedoresHashSet;

public class Tela {
	public static void main(String args[]) throws FornecedorNaoExisteException{
		Tela tela = new Tela();
		System.out.println("Array List:");
		tela.runArrayList();
		System.out.println();
		System.out.println("Hash Set:");
		tela.runHashSet();
		System.out.println();
		System.out.println("Hash Map:");
		tela.runHasMap();
	}
	
	public void runArrayList() throws FornecedorNaoExisteException{
		Fornecedor fornecedor = new Fornecedor(1, "Francisco", "05605694323", "Rua dos bobos, 0");
		Fornecedor fornecedor2 = new Fornecedor(2, "Alcoforado", "05605694323", "Rua dos bobos, 0");
		FornecedoresArrayList lista = new FornecedoresArrayList();
		lista.adicionar(fornecedor2);
		lista.adicionar(fornecedor);
		
		System.out.println("Lista apos adicionar 2 Fornecedores:");
		lista.printList();
		
		Fornecedor busca = lista.procurar(fornecedor);
		System.out.println();
		System.out.println("Fornecedor codigo 1 Procurado:");
		System.out.println(busca.toString());
		
		lista.remover(fornecedor2);
		
		System.out.println();
		System.out.println("Lista apos remover 1 Fornecedor:");
		lista.printList();
	
	}
	public void runHasMap() throws FornecedorNaoExisteException{
		Fornecedor fornecedor = new Fornecedor(1, "Francisco", "05605694323", "Rua dos bobos, 0");
		Fornecedor fornecedor2 = new Fornecedor(2, "Alcoforado", "05605694323", "Rua dos bobos, 0");
		FornecedoresHashMap lista = new FornecedoresHashMap();
		lista.adicionar(fornecedor);
		lista.adicionar(fornecedor2);
		
		System.out.println("Lista apos adicionar 2 Fornecedores:");
		lista.printMap();
		
		Fornecedor busca = lista.procurar(fornecedor);
		System.out.println();
		System.out.println("Fornecedor Procurado:");
		System.out.println(busca.toString());
		
		lista.remover(fornecedor2.getCodigo());
		
		System.out.println();
		System.out.println("Lista apos remover 1 Fornecedor:");
		lista.printMap();
	}
	public void runHashSet() throws FornecedorNaoExisteException{
		Fornecedor fornecedor = new Fornecedor(1, "Francisco", "05605694323", "Rua dos bobos, 0");
		Fornecedor fornecedor2 = new Fornecedor(2, "Alcoforado", "05605694323", "Rua dos bobos, 0");
		FornecedoresHashSet lista = new FornecedoresHashSet();
		lista.adicionar(fornecedor2);
		lista.adicionar(fornecedor);
		
		System.out.println("Lista apos adicionar 2 Fornecedores:");
		lista.printSet();
		
		Fornecedor busca = lista.procurar(fornecedor);
		System.out.println();
		System.out.println("Fornecedor Procurado:");
		System.out.println(busca.toString());
		
		lista.remover(fornecedor2);
		
		System.out.println();
		System.out.println("Lista apos remover 1 Fornecedor:");
		lista.printSet();
	}
}
