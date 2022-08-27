package calculadoraJUnitTest;

import org.junit.jupiter.api.Test;
import calculadora.Subtracao;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SubtracaoJunitTest {

	//Cenario de Teste 1: Subtrair dois numeros positivos
	@Test
	public void SubtrairDoisNumerosPositivos() {
		Subtracao sub = new Subtracao();
		int subtracao = sub.subtrair(3,2);
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(1, subtracao);
	}
	
	//Cenario de Teste 2: Subtrair dois numeros negativos
	@Test
	public void SubtrairDoisNumerosNegativos() {
		Subtracao sub = new Subtracao();
		int subtracao = sub.subtrair(-3,-2);
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(-1, subtracao);
	}

	//Cenario de Teste 3: Subtrair com o numero zero
	@Test
	public void SubtraircomZero() {
		Subtracao sub = new Subtracao();
		int subtracao = sub.subtrair(3,0);
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(3, subtracao);
	}
	
	//Cenario de Teste 4: Subtrair primeiro numero negativo maior que o segundo numero
	@Test
	public void SubtrairNegativoPositivo() {
		Subtracao sub = new Subtracao();
		int subtracao = sub.subtrair(-3,2);
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(-5, subtracao);
	}
	
	//Cenario de Teste 5: Subtrair primeiro numero positivo maior que o segundo numero negativo
	@Test
	public void SubtrairPositivoNegativo() {
		Subtracao sub = new Subtracao();
		int subtracao = sub.subtrair(3,-2); 
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(5, subtracao);
	}
	
	//Cenario de Teste 6: Subtrair dois numeros zeros
	@Test
	public void SubtrairZeros() {
		Subtracao sub = new Subtracao();
		int subtracao = sub.subtrair(0,0);
		
		//Resultado espetado deve ser igual ao que a variável soma recebeu
		Assert.assertEquals(0, subtracao);
	}
}
