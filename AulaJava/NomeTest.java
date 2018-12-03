package br.com.db1.db1start.aula10;

import org.junit.Assert;
import org.junit.Test;

public class NomeTest {
	@Test //chama o Junit
	public void deveTransformarParaLetraMaiuscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiuscula("fernanda kishimoto");
		Assert.assertEquals("FERNANDA KISHIMOTO",valorTransformado);
		
		
	}
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNOme("FERNANDA KISHIMOTO");
		Assert.assertEquals(18,tamanhoDoNome);
		
		
	}

}
