package calculadoraTest;
import calculadora.Subtracao;

public class SubtracaoTest {
	public static void main(String [] args) {
		Subtracao sub = new Subtracao();
		
		//Cenario de Teste 1:Subtrair dois numeros positivos a > b 
		int subtracao = sub.subtrair(3,2);
		System.out.println(subtracao);
			
		//Cenario de Teste 2:Subtrair dois numeros positivos a < b 
		subtracao = sub.subtrair(2,3);
		System.out.println(subtracao);
				
		//Cenario de Teste 3:Subtrair dois numeros negativos
		subtracao = sub.subtrair(-2,-3);
		System.out.println(subtracao);
				
		//Cenario de Teste 4:Somar primeiro numero negativo maior que o segundo numero
		subtracao = sub.subtrair(-5,3);
		System.out.println(subtracao);
				
		//Cenario de teste 5:Subtrair primeiro numero positivo maior que o segundo numero negativo
		subtracao = sub.subtrair(7,-3);
		System.out.println(subtracao);
				
		//Cenario de teste 5:Subtrair dois numeros zeros
		subtracao = sub.subtrair(0,0);
		System.out.println(subtracao);
		
		}
	
}
