package entidades;

public class Administrador extends Pessoa{
	
	private double ajudaDeCusto;

	

	public Administrador(String nome, String telefone, String endereco, double ajudaDeCusto) {
		super(nome, telefone, endereco);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
}
