package entidades;

public class Fornecedor extends Pessoa {
	
	
	private double valorCredito;
	private double valorDivida;
	
	
	public Fornecedor(String nome, String telefone, String endereco ) {
		super(nome, telefone, endereco);
		
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public  double obterSaldo() {
		double saldo=0;
		
		saldo= getValorCredito()- getValorDivida();
		
		return saldo;
	}
	
	


	

}
