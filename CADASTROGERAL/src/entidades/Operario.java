package entidades;

public class Operario extends Pessoa {

	private double valorProducao;
	private double comissao;
	private double salarioBase;
	
	
	public Operario(String nome, String telefone, String endereco) {
		super(nome, telefone, endereco);
		
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double lucro() {
		double lucro=0;
		lucro=(getComissao()+getSalarioBase())-getValorProducao();
		return lucro;
	}
	
}
