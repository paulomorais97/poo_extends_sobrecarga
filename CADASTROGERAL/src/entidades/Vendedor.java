package entidades;

public class Vendedor extends Pessoa{

	private double valorVendas;
	private double comissao;
	private double salarioBase;
	
	public Vendedor(String nome, String telefone, String endereco) {
		super(nome, telefone, endereco);
		
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
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
	public double salarioFinal() {
		double salario;
		salario = getSalarioBase()+getComissao();
		return salario;
	}
}
