
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
		//Tem que ser de 1 � 100
		int numeroconta, 
		int id_client, 
		int agencia, 
		//Tem que ser F ou J
		String tipoconta, 
		//Tem que ser maior ou igual � 0
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
		if(numeroconta > 0 && numeroconta < 100) {
			this.numeroconta = numeroconta;
		} else {
			throw new java.lang.Error("N�mero da conta inv�lido");
		}
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
		if(tipoconta == "F" || tipoconta == "J") {		
			this.tipoconta = tipoconta;
		} else {
			throw new java.lang.Error("Tipo da conta inv�lido");
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo > 0) {
			this.saldo = saldo;
		} else {
			throw new java.lang.Error("Saldo inv�lido");
		}
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
 
}
