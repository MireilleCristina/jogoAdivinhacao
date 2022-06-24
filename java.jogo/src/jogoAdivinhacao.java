
import java.io.PrintStream;/*importar objeto  classe PrintStream*/
import java.util.Random;/*gerar numero aletório*/
import java.util.Scanner;

public class jogoAdivinhacao {

	public static void main(String[] args) {
		
	PrintStream show = System.out;/*show: é a mesma coisa que = system.out*/
	Scanner scan = new Scanner(System.in);
	Random gerador =new Random();/*objeto tipo random chamado gerador,gerar numero aleatorio*/
	
		
	int opcao;
	int escolha_computador;
	int escolha_usuario;
	
	
	show.println("Olá,Qual o seu nome?");
	String nome = scan.nextLine();
	show.println("Prazer em conhecer " + nome + "!");
	show.println(nome + " Você quer jogar comigo?sim digite 1 e não digite 2");
 	show.println("Digite um numero 0 a 10");
 	opcao= scan.nextInt();
	
	if(opcao == 2) {
		
		show.println("Que pena,deixa para proxima");	
	}else if(opcao == 1){
		
		show.println("Ok,o jogo funciona assim...");
		show.println("Eu vou escolher um numero de 0 a 10 e você terá que adivinhar ");
		show.println("Se acertar o numero você é o vencedor  ");
		
		
		escolha_computador = gerador.nextInt(11);	
		
		show.println("OK," +nome+". Eu já escolhi ");
		show.println("Agora é sua vez, adivinha qual numero que eu ecolhi");	
	
	do{
		
		escolha_usuario = scan.nextInt();
		if(escolha_usuario!=escolha_computador){
			show.println(nome + " Sua resposta está errada ");
		
		}else{
			show.println("Parabéns " +nome+ " Sua resposta está CERTA!!! ");
		}		

	}while(escolha_computador!=escolha_usuario);
	
	}
	}
}
	