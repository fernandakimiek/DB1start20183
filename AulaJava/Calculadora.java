package br.com.db1.db1start.aula10;

public class Calculadora {
	
	public  Integer somar(Integer numeroUm, Integer numeroDois) {
		
		return numeroUm + numeroDois;
	}
	
	public Integer subtrair(Integer numeroUm, Integer numeroDois) {
		
		return numeroUm - numeroDois;
	}
	
	public Integer multiplicar(Integer numeroUm, Integer numeroDois) {
		return numeroUm * numeroDois;
	}
	
	public Integer dividir(Integer numeroUm, Integer numeroDois) {
		return numeroUm / numeroDois;
	}
	
	public boolean numeroPar(Integer numeroPar) {
		return numeroPar % 2 == 0;
	}
	
	public Integer numeroMaior(Integer n1, Integer n2) {
		return Math.max(n1,n2);
	}
	
	public Integer contadorImpar(Integer numero) {
		int quantidadeImpar = 0;
		for (int i = numero; i<100; i++){
			if (i % 2 == 1) {
				quantidadeImpar++;
			}
			
		}
		return quantidadeImpar;
		
	}

}
