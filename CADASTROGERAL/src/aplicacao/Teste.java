package aplicacao;
import java.util.Locale;

import entidades.Administrador;
import entidades.Empregado;
import entidades.Fornecedor;
import entidades.Operario;
import entidades.Vendedor;

public class Teste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.println("\n---SISTEMA DE CADASTRO GERAL---");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	    System.out.println("Fornecedor");
		Fornecedor fornecedor1 = new Fornecedor("Marcos", "2555-2545","Rua Doutor Assis");
		Fornecedor fornecedor2 = new Fornecedor("Fernando", "2745-5410","Rua Estevão Borges");
		
		fornecedor1.setValorCredito(354);
		fornecedor1.setValorDivida(231);
		
		fornecedor2.setValorCredito(550);
		fornecedor2.setValorDivida(442);
		
		System.out.println(fornecedor1.getNome()+"| Tel: "+fornecedor1.getTelefone()+" |Endereço: "+fornecedor1.getEndereco()+"Saldo: R$"+fornecedor1.obterSaldo());
		System.out.println(fornecedor2.getNome()+ "| Tel: "+fornecedor2.getTelefone()+"| Endereço: "+fornecedor2.getEndereco()+ " | Saldo: R$"+fornecedor2.obterSaldo());
	
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	    System.out.println("Empregado");
		Empregado empregado1 = new Empregado("Vania","2518-4550", "Avenida João Ramalho", 12345);
		empregado1.setSalarioBase(1018.16);
		empregado1.setImposto(350);
		System.out.println(empregado1.getNome()+" | Código: "+empregado1.getCodigoSetor()+" | Salario final: R$"+empregado1.calcularSalario());
		 
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		 System.out.println("Administrador");
		 Administrador adm = new Administrador("Vitória", "95848-4541", "Rua Xavier da Fonseca", 550.20);
		 System.out.println(adm.getNome()+" | Tel: "+adm.getTelefone()+" | Endereço: "+adm.getEndereco()+" | Ajuda de custo: R$"+adm.getAjudaDeCusto());
		
		 System.out.println("--------------------------------------------------------------------------------------------------------------");
		 System.out.println("Operario");
		 
		 Operario operario1 = new Operario("Ricardo", "94758-5410", "Rua Barão de Mauá");
		 operario1.setSalarioBase(1500);
		 operario1.setComissao(170);
		 operario1.setValorProducao(870);
		 
		 System.out.println(operario1.getNome()+ " | Tel: "+operario1.getTelefone()+" | Endereço: "+operario1.getEndereco()+" | Lucro: R$"+operario1.lucro());
		 
		 System.out.println("--------------------------------------------------------------------------------------------------------------");
		 System.out.println("Vendedor");
		 
		 Vendedor vendedor1 = new Vendedor("Rafael", "94584-5715","Avenida São João");
		 
		 vendedor1.setValorVendas(550);
		 vendedor1.setSalarioBase(1200);
		 vendedor1.setComissao(135);
		 
		 System.out.println(vendedor1.getNome()+" | Tel: "+vendedor1.getTelefone()+" | Endereço: "+vendedor1.getEndereco()+" | Salario final: R$"+vendedor1.salarioFinal()+ " | Valor das vendas: R$"+vendedor1.getValorVendas());
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
