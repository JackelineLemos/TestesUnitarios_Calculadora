package calculadoraTest;
import calculadora.Soma;

public class SomaTest {
	public static void main(String [] args) {
		Soma som = new Soma();
		
		//Cenario de Teste 1: Somar dois numeros positivos
		int soma = som.somar(2,3);
		System.out.println(soma);
		
		//Cenario de Teste 2: Somar dois numeros negativos
		soma = som.somar(-2,-3);
		System.out.println(soma);
		
		//Cenario de Teste 3: Somar com o numero zero
		soma = som.somar(0,3);
		System.out.println(soma);
		
		//Cenario de Teste 4: Somar primeiro numero negativo maior que o segundo numero
		soma = som.somar(-5,3);
		System.out.println(soma);
		
		//Cenario de Teste 5: Somar primeiro numero positivo maior que o segundo numero negativo
		soma = som.somar(5,-3);
		System.out.println(soma);
		
		//Cenario de Teste 6: Somar dois numeros zeros
		soma = som.somar(-5,3);
		System.out.println(soma);
		}
}
