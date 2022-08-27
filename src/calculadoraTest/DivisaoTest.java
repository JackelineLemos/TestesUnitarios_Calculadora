package calculadoraTest;

import calculadora.Divisao;

public class DivisaoTest {
	public static void main(String [] args) {
	Divisao div = new Divisao();
	
	//Cenario de Teste 1: Dividir dois numeros positivos
	int divisao = div.dividir(10,2);
	System.out.println(divisao);
			
	//Cenario de Teste 2: Dividir dois numeros negativos
	divisao = div.dividir(-10, -2);
	System.out.println(divisao);
			
	//Cenario de Teste 3: Dividir primeiro numero negativo maior que o segundo numero positivo
	divisao = div.dividir(-10,2);
	System.out.println(divisao);
			
	//Cenario de Teste 4: Dvidir primeiro numero positivo maior que o segundo numero negativo
	divisao = div.dividir(10,-2);
	System.out.println(divisao);
			
	//Cenario de Teste 5: Dividir por um numero não divizivel (resultado "quebrado")
	divisao = div.dividir(2,3);
	System.out.println(divisao);
	
	//Cenario de Teste 6: Dividir por numero zero (EXPECT: ERRO)
	divisao = div.dividir(2,0);
	System.out.println(divisao);
	
	}
}
