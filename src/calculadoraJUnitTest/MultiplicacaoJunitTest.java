package calculadoraJUnitTest;

import org.junit.jupiter.api.Test;
import calculadora.Multiplicacao;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MultiplicacaoJunitTest {
@Test
	
//Cenario de Teste 1: Multiplicar dois numeros positivos
	public void SomarDoisNumerosPositivos() {
		Multiplicacao mult = new Multiplicacao();
		int multiplicacao = mult.multiplicar(2,3); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(6, multiplicacao);
	}
	
	//Cenario de Teste 2: Multiplicar dois numeros negativos
	@Test
	public void SomarDoisNumerosNegativos() {
		Multiplicacao mult = new Multiplicacao();
		int multiplicacao = mult.multiplicar(-2,-3);  
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(6, multiplicacao);
	}

	//Cenario de Teste 3: Multiplicar com o numero zero
	@Test
	public void SomarcomZero() {
		Multiplicacao mult = new Multiplicacao();
		int multiplicacao = mult.multiplicar(2,0); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(0, multiplicacao);
	}
	
	//Cenario de Teste 4: Multiplicar primeiro numero negativo o segundo numero positivo
	@Test
	public void SomarNegativoPositivo() {
		Multiplicacao mult = new Multiplicacao();
		int multiplicacao = mult.multiplicar(-2,3); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(-6, multiplicacao);
	}
	
	//Cenario de Teste 5: Multiplicar primeiro numero positivo segundo numero negativo
	@Test
	public void SomarPositivoNegativo() {
		Multiplicacao mult = new Multiplicacao();
		int multiplicacao = mult.multiplicar(2,-3); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(-6, multiplicacao);
	}
	

	
}
