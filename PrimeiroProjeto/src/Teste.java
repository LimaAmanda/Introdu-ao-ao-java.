import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receber = new Scanner(System.in);
		String nome;
		int idade;
		System.out.println("Digite seu nome");
		nome = receber.nextLine();
		System.out.println("Digite sua idade");
		idade = receber.nextInt();
		System.out.println(nome + "\n" + idade);
		
		
		

	}

}
