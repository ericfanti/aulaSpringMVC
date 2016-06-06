package br.csi.dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	private void initClientes(){
		
		if(clientes.size() <=0){
			
			clientes = new ArrayList<Cliente>();
			
			Cliente c= new Cliente();
			
			c.setCodigo(gerarCodigo());
			c.setNome("Paulo");
			c.setBairro("Centro");
			c.setRuaNroComp("Dqueu de caxias n 186 apt 23");
			c.setCidade("Santa maria");
			
			clientes.add(c);
		}
	}
	
	private long gerarCodigo()
	{
		int co = clientes.size()+1;
		String cod = String.valueOf(co);
		Long codigo = Long.parseLong(cod);
		
		return codigo;
	}
	
	public boolean adicionar(Cliente c){
		
		System.out.println("DENTRO CLIENTE DAO");
		System.out.println("Nome:" +c.getNome());
		System.out.println("Rua:" +c.getRuaNroComp());
		c.setCodigo(gerarCodigo());
		clientes.add(c);
		
		return true;
		
	}
	
	//public boolean remover(Cliente c){
		
		
		
	//}
	
	public ArrayList<Cliente> listaClientes(){
		
		initClientes();
		
		return clientes;
	}
}
