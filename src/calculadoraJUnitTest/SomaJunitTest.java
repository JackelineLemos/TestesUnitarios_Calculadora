package calculadoraJUnitTest;

import org.junit.jupiter.api.Test;
import calculadora.Soma;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SomaJunitTest {

	@Test
	
	//Cenario de Teste 1: Somar dois numeros positivos
	public void SomarDoisNumerosPositivos() {
		Soma som = new Soma();
		int soma = som.somar(3, 2); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(5, soma);
	}
	
	//Cenario de Teste 2: Somar dois numeros negativos
	@Test
	public void SomarDoisNumerosNegativos() {
		Soma som = new Soma();
		int soma = som.somar(-3, -2); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(-5, soma);
	}

	//Cenario de Teste 3: Somar com o numero zero
	@Test
	public void SomarcomZero() {
		Soma som = new Soma();
		int soma = som.somar(3, 0); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(3, soma);
	}
	
	//Cenario de Teste 4: Somar primeiro numero negativo maior que o segundo numero
	@Test
	public void SomarNegativoPositivo() {
		Soma som = new Soma();
		int soma = som.somar(-3, 2); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(-1, soma);
	}
	
	//Cenario de Teste 5: Somar primeiro numero positivo maior que o segundo numero negativo
	@Test
	public void SomarPositivoNegativo() {
		Soma som = new Soma();
		int soma = som.somar(3, -2); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(1, soma);
	}
	
	//Cenario de Teste 6: Somar dois numeros zeros
	@Test
	public void SomarZeros() {
		Soma som = new Soma();
		int soma = som.somar(0, 0); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(0, soma);
	}
}

		
		
		
		
		
		