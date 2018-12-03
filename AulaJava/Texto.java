package br.com.db1.db1start.aula10;

import org.hamcrest.core.SubstringMatcher;

public class Texto {
	
	public String nomeLetraMaiuscula(String nome) {
		 
		return nome.toUpperCase();
	}
	
	public String nomeLetraMinuscula(String nome) {
		return nome.toLowerCase();
	}
	
	public int quantidadeLetras (String nome) {
		return nome.length();
	}
	
	public int quantidadeLetrasSemEspacos (String nome) {
		return nome.trim().length();
	}
	
	public String RetornaPrimeirasLetras ( String nome) {
		return nome.substring(0, 4);
	}
	
	public String NaoRetornaPrimeirasLetras (String nome) {
		return nome.substring(2);
	}
	
	public String UltimasLetrasDoNome(String nome) {
		return nome.substring(14);
	}
	
	public String TrocaNome(String nome) {
		return nome.replace("Fernanda", "ALUNA"); //arrumar
	}
	
	public String[] separaNomes(String nome) {
		return nome.split(",");
	}
	
	public int retornaVogais (String texto){
	        int contarVogais = 0;
	        for (int i = 0; i < texto.length(); i++){
	            char c = texto.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
	                contarVogais++;
	        }
	        return contarVogais;
	    }
	
	/*public String retornaReverso(String texto) {
		
		StringBuffer reverso = new StringBuffer(texto);
		
		return texto.re
		
	}*/

}
