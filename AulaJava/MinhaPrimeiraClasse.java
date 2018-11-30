package br.com.db1.db1start.aula10;

public class MinhaPrimeiraClasse {
	
	public static void main(String[] args) {
		/*System.out.println("Ola Mundo!");
		Integer numeroASerVerificado = 3;
		boolean eVerdade = numeroASerVerificado == 3;
		boolean eVerdadeNumeroImpar = numeroASerVerificado % 2 > 0;
		System.out.println(eVerdade);
		System.out.println(eVerdadeNumeroImpar);
		Integer somaDosNumeros = numeroASerVerificado + numeroASerVerificado;
		Integer divisaoDosNumeros = numeroASerVerificado / numeroASerVerificado;
		Integer multiplicacaoDosNumero = numeroASerVerificado * numeroASerVerificado;
		System.out.println("A soma dos números é: " + somaDosNumeros);
		System.out.println("A divisão dos números é: " + divisaoDosNumeros);
		System.out.println("A multiplicação dos números é: " + multiplicacaoDosNumero);*/
		
		Integer resultadoDaSoma = MinhaPrimeiraClasse.somar(1, 10);
		Integer resultadoDaDivisao = MinhaPrimeiraClasse.dividir(10,2);
		Integer resultadoDaMultiplicacao = MinhaPrimeiraClasse.multiplicar(7, 8);
		Integer resultadoDaSubtracao = MinhaPrimeiraClasse.subtrair(45,5);
		MinhaPrimeiraClasse.imprimirValor(resultadoDaSoma);
		MinhaPrimeiraClasse.imprimirValor(resultadoDaDivisao);
		MinhaPrimeiraClasse.imprimirValor(resultadoDaMultiplicacao);
		MinhaPrimeiraClasse.imprimirValor(resultadoDaSubtracao);
		
		
	}
	
	public static Integer somar(Integer numeroUm, Integer numeroDois) {
		
		return numeroUm + numeroDois;
		
	}
	
	public static Integer dividir (Integer numeroUm, Integer numeroDois) {
		return numeroUm / numeroDois;
	}
	
	
	public static Integer multiplicar (Integer numeroUm, Integer numeroDois) {
		return numeroUm * numeroDois;
	}
	
	public static Integer subtrair(Integer numeroUm, Integer numeroDois) {
		return numeroUm - numeroDois;
	}
	
	public static void imprimirValor(Integer valor) {
		System.out.println(valor);
	}

}
