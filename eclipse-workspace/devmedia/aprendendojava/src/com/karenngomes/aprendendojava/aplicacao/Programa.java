package com.karenngomes.aprendendojava.aplicacao;

import java.util.Scanner;

import com.karenngomes.aprendendojava.dominio.Colecionador;
import com.karenngomes.aprendendojava.dominio.Item;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colecionador colecionador;
		Item item;
		String nomeColecionador, nomeItem;
		int ano;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome do colecionador: ");
		nomeColecionador = entrada.nextLine();
		//System.out.println("Nome: " + nomeColecionador);
		colecionador = new Colecionador(nomeColecionador);
		
		while(true) {	
			System.out.println("=========================");
			System.out.print("Informe o nome do item: ");
			nomeItem = entrada.nextLine();
			
			if(nomeItem.isEmpty())
				break;
			
			System.out.print("Informe o ano em que esse item foi fabricado: ");
			ano = Integer.parseInt(entrada.nextLine());
			
			item = new Item(nomeItem, ano);
			
			colecionador.getColecao().add(item);
		}
		
		System.out.println("A coleção de " + colecionador.getNome() + " é: " + colecionador.getColecao());
		
	}

}
