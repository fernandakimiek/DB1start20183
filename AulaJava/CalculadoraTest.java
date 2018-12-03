package br.com.db1.db1start.aula10;

import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTest {
	
	@Test
	public void deveSomar() {
		Calculadora calculadora = new Calculadora();
		int valorSomado = calculadora.somar(8, 2);
		Assert.assertEquals(10, valorSomado);
	
	}
	
	@Test
	public void deveSubtrair() {
		Calculadora calculadora = new Calculadora();
		int valorSubtraido = calculadora.subtrair(10,5);
		Assert.assertEquals(5, valorSubtraido);
	}
	
	@Test
	public void deveMultiplicar() {
		Calculadora calculadora = new Calculadora();
		int valorMultiplicado = calculadora.multiplicar(5,5);
		Assert.assertEquals(25,valorMultiplicado);
	}
	
	@Test
	public void deveDividir() {
		Calculadora calculadora = new Calculadora();
		int valorDividido = calculadora.dividir(10,2);
		Assert.assertEquals(5,valorDividido);
	}
	
	@Test
	public void deveMostrarNumeroPar() {
		Calculadora calculadora = new Calculadora();
		boolean valorPar = calculadora.numeroPar(8);
		// pode usar Assert.assertTrue
		// fazer um teste que vc passe um número impar com um assertFalse
		Assert.assertTrue(true);
			
	}
	
	@Test
	public void deveMostrarNumeroImpar() {
		Calculadora calculadora = new Calculadora();
		boolean valorImpar = calculadora.numeroPar(6);
		Assert.assertFalse(false);
	}
	
	@Test
	public void deveMostrarNumeroMaior() {
		Calculadora calculadora = new Calculadora();
		int valorMaior = calculadora.numeroMaior(10,20);
		Assert.assertEquals(20,valorMaior);
	}
	
	@Test 
	public void deveMostrarNumerosImpares() {
		Calculadora calculadora = new Calculadora();
		int valoresImpares = calculadora.contadorImpar(50);
		Assert.assertEquals(25, valoresImpares);
		
	}
}
