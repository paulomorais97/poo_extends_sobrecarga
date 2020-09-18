package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceiros;

public class PrincipalList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Funcionario> list = new ArrayList<>();
		
		int n, hora;
		char opcao;
		String nome;
		double valor, extra;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o numero de funcionários: ");
		n = ler.nextInt();
		
		for(int i=0; i<n;i++) {
			
			System.out.print("Funcionário -> [F] ou Terceiro -> [T]? ");
			opcao = ler.next().toUpperCase().charAt(0);
			
				System.out.println("\n------------------------------");
				System.out.print("Nome: ");
				nome = ler.next();
				System.out.print("\nHoras trabalhadas: ");
				hora = ler.nextInt();
				System.out.print("\nValor da hora trabalhada: R$");
				valor = ler.nextDouble();
				if(opcao =='T') {
					System.out.print("\nDigite o hora extra: ");
					extra = ler.nextDouble();
					list.add(new Terceiros(nome, hora, valor, extra));
					
				}
				else {
					list.add(new Funcionario(nome, hora, valor));
				}
				
		}
		System.out.println(" ");
		System.out.println("Pagamentos: ");
		for(Funcionario x : list) {
			System.out.println("\nNome: "+x.getNome().toUpperCase()+"| Salário: R$"+x.pagamento());
		}
		
	}

}
