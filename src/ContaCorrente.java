
public class ContaCorrente {
	private int numeroconta;
	private int id_client;
	private int agencia;
	private String tipoconta;
	private double saldo;
	private boolean ativo;
	public ContaCorrente() {
		
	}
	public ContaCorrente
	(
		//Tem que ser de 1 à 100
		int numeroconta, 
		int id_client, 
		int agencia, 
		//Tem que ser F ou J
		String tipoconta, 
		//Tem que ser maior ou igual á 0
		double saldo, 
		boolean ativo
	){
		setNumeroconta(numeroconta);
		setId_client(id_client);
		setAgencia(agencia);
		setTipoconta(tipoconta);
		setSaldo(saldo);
		setAtivo(ativo);
	}
	
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getTipoconta() {
		return tipoconta;
	}
	public void setTipoconta(String tipoconta) {
		if(tipoconta != "F" || tipoconta != "J") {
			
		}
		this.tipoconta = tipoconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
 
}
