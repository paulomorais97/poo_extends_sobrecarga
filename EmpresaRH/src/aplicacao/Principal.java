package aplicacao;

import java.util.Locale;

import entidades.Funcionario;
import entidades.Terceiros;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Funcionario funcionario1 = new Funcionario("João");
		
		funcionario1.setHorasTrabalhadas(40);
		funcionario1.setValorPorHora(10);
		System.out.println("--------------------------------------------");
		System.out.println("Funcionário");
		System.out.println("Nome: "+funcionario1.getNome()+" | Salário por dia: R$"+funcionario1.pagamento());
		

		Terceiros terceiro1 = new Terceiros("Maria");
		
	//	terceiro1.setHorasTrabalhadas(8);
	//	terceiro1.setValorPorHora(10.15);
		terceiro1.setHorasAdicionais(3);
		System.out.println("--------------------------------------------");
		System.out.println("Terceiro");
		System.out.println("Nome: "+ terceiro1.getNome()+" | Salário: R$"+terceiro1.pagamento());
	}

}
