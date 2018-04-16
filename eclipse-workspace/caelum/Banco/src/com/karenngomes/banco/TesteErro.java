package com.karenngomes.banco;
import java.io.FileNotFoundException;

public class TesteErro {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//System.out.println("inicio do main");
		//metodo1();
		//System.out.println("fim do main");
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (java.io.FileNotFoundException z) {
			System.out.println("Não foi possivel abrir o arquivo");
			z.printStackTrace();
		}
	}
	
	static void metodo1() {
		System.out.println("inicio do metodo 1");
		try {
			metodo2();
		} catch (ArrayIndexOutOfBoundsException y) {
			System.out.println("erro: " + y);
		}
		System.out.println("fim do metodo 1");
	}
	
	static void metodo2() {
		System.out.println("inicio do metodo 2");
		int[] array = new int[10];
	
		for(int i = 0; i <= 15; i++) {
			//try {
				array[i] = i;
				System.out.println(i);
			//} catch (ArrayIndexOutOfBoundsException x) {
				//System.out.println("erro: " + x);
			//}
		}
		
		System.out.println("fim do metodo 2");
	}
	
}
