package calculadoraTest;

import calculadora.Multiplicacao;

public class MultiplicacaoTest {
	
	public static void main(String [] args) {
		
		Multiplicacao mult = new Multiplicacao();
		//Cenario de Teste 1: Multiplicar dois numeros positivos
		int multiplicacao = mult.multiplicar(2,3);
		System.out.println(multiplicacao);
				
		//Cenario de Teste 2: Multiplicar dois numeros negativos
		multiplicacao = mult.multiplicar(-2,-3);
		System.out.println(multiplicacao);
				
		//Cenario de Teste 3: Multiplicar com o numero zero
		multiplicacao = mult.multiplicar(2,0);
		System.out.println(multiplicacao);
			
		//Cenario de Teste 4: Multiplicar primeiro numero o segundo numero positivo
		multiplicacao = mult.multiplicar(-2,3);
		System.out.println(multiplicacao);
				
		//Cenario de Teste 5: Multiplicar primeiro numero positivo segundo numero negativo
		multiplicacao = mult.multiplicar(2,-3);
		System.out.println(multiplicacao);

		
		}
}
