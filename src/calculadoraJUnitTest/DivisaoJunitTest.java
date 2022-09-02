package calculadoraJUnitTest;

import org.junit.jupiter.api.Test;

import calculadora.Divisao;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class DivisaoJunitTest {
	@Test
	
	//Cenario de Teste 1: Dividir dois numeros positivos
		public void DividirDoisNumerosPositivos() {
		Divisao div = new Divisao();
		int divisao = div.dividir(10,2);
			
			//Resultado espetado deve ser igual ao que a variável soma recebeu
			Assert.assertEquals(5, divisao);
		}
		
	//Cenario de Teste 2: Dividir dois numeros negativos
		@Test
		public void DividirDoisNumerosNegativos() {
			Divisao div = new Divisao();
			int divisao = div.dividir(-10,-2); 
			
			//Resultado espetado deve ser igual ao que a variável soma recebeu
			Assert.assertEquals(5, divisao);
		}

		//Cenario de Teste 3: Dividir primeiro numero negativo maior que o segundo numero positivo
		@Test
		public void DividirNegativoPositivo() {
			Divisao div = new Divisao();
			int divisao = div.dividir(-10,2); 
			
			//Resultado espetado deve ser igual ao que a variável soma recebeu
			Assert.assertEquals(-5, divisao);
		}
		
		//Cenario de Teste 4: Dvidir primeiro numero positivo maior que o segundo numero negativo
		@Test
		public void DividirNegativoPositivo() {
			Divisao div = new Divisao();
			int divisao = div.dividir(10,-2); 
			
			//Resultado espetado deve ser igual ao que a variável soma recebeu
			Assert.assertEquals(-5, divisao);
		}
		
		//Cenario de Teste 5: Dividir por um numero não divizivel (resultado "quebrado")
		@Test
		public void DividirPositivoNegativo() {
			Divisao div = new Divisao();
			int divisao = div.dividir(10,3); 
			
			//Resultado espetado deve ser igual ao que a variável soma recebeu
			Assert.assertEquals(3, divisao);
		}
		
		//Cenario de Teste 6: Dividir por numero zero (EXPECT: ERRO)
				@Test
				public void DividirPorZero() {
					Divisao div = new Divisao();
					int divisao = div.dividir(10,0); 
					
					//Resultado espetado deve ser igual ao que a variável soma recebeu
					Assert.assertEquals(0, divisao);
				}


}
