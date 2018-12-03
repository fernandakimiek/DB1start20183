package br.com.db1.db1start.aula10;

import org.junit.Assert;
import org.junit.Test;

public class TextoTest {
	
	@Test
	public void DeveTransformarEmLetraMaiuscula() {
		
		Texto texto = new Texto();
		String nomeTransformado = texto.nomeLetraMaiuscula("fernanda kishimoto");
		Assert.assertEquals("FERNANDA KISHIMOTO", nomeTransformado);
	
	}
	
	@Test
	public void DeveTransformarEmLetraMinuscula() {
		Texto texto = new Texto();
		String nomeMinusculo = texto.nomeLetraMinuscula("MARIA DE SOUZA");
		Assert.assertEquals("maria de souza", nomeMinusculo);
	}
	
	@Test
	public void DeveRetornarQuantidadeLetras() {
		Texto texto = new Texto();
		int tamanhoNome = texto.quantidadeLetras("DB1START");
		Assert.assertEquals(8,tamanhoNome);
	}
	
	@Test
	public void DeveRetornarQuantidadeLetrasSemEspaco() {
		Texto texto = new Texto();
		int TamanhoNomeSemEspaco = texto.quantidadeLetrasSemEspacos(" DB1START ");
		Assert.assertEquals(8,TamanhoNomeSemEspaco);
	}
	
	@Test
	public void DeveRetornarPrimeirasLetras() {
		Texto texto = new Texto();
		String QuatroLetrasPrimeiras = texto.RetornaPrimeirasLetras("Fernanda Kishimoto");
		Assert.assertEquals("Fern",QuatroLetrasPrimeiras);
	}
	
	@Test
	public void DeveRetornarSemAsPrimeirasLetras() {
		Texto texto = new Texto();
		String SemAsPrimeirasLetras = texto.NaoRetornaPrimeirasLetras("Fernanda Kishimoto");
		Assert.assertEquals("rnanda Kishimoto", SemAsPrimeirasLetras);
	}
	
	@Test
	public void DeveRetornarAsUltimasLetras() {
		Texto texto = new Texto();
		String UltimasLetras = texto.UltimasLetrasDoNome("Fernanda Kishimoto");
		Assert.assertEquals("moto",UltimasLetras);
	}
	
	@Test
	public void DeveRetornarNomeTrocado() {
		Texto texto = new Texto();
		String nomeTrocado = texto.TrocaNome("Fernanda Kishimoto");
		Assert.assertEquals("ALUNA Kishimoto", nomeTrocado);
	}
	
	@Test
	public void DeveRetornarNomesSeparados() {
		Texto texto = new Texto();
		String[] NomesSeparados = texto.separaNomes("banana, maçã, melancia");
	
	}
	
	@Test
	public void DeveRetornarQuantidadeVogais() {
		Texto texto = new Texto();
		int numeroVogais = texto.retornaVogais("ola tudo bem");
		Assert.assertEquals(5,numeroVogais);
	}

}
