package br.csi.dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {
	
	private ArrayList<Cliente> clientes;
	
	private void initClientes(){
		
		clientes = new ArrayList<Cliente>();
		
		Cliente c= new Cliente();
		
		c.setNome("Paulo");
		c.setBairro("Centro");
		c.setRuaNroComp("Dqueu de caxias n 186 apt 23");
		c.setCidade("Santa maria");
		
		clientes.add(c);
	}
	
	public boolean adicionar(Cliente c){
		
		System.out.println("DENTRO CLIENTE DAO");
		System.out.println("Nome:" +c.getNome());
		System.out.println("Rua:" +c.getRuaNroComp());
		
		clientes.add(c);
		
		return true;
		
	}

	
	public ArrayList<Cliente> listaClientes(){
		
		initClientes();
		
		return clientes;
	}
}
