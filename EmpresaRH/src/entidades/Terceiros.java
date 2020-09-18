package entidades;

public class Terceiros  extends Funcionario{

	private double horasAdicionais;

	
	public Terceiros(String nome ) {
		super(nome);
		
	}
	

	public Terceiros(String nome, int horasTrabalhadas, double valorPorHora) {
		super(nome, horasTrabalhadas, valorPorHora);
	}


	public Terceiros(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}


	public double getHorasAdicionais() {
		return horasAdicionais;
	}


	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
	@Override
	public double pagamento() {
		
		return 	( getHorasAdicionais() * getValorPorHora()) + super.pagamento();
	
	}
	
	
	
}
