// Aluno : Bruno Filipe Ramos Martins
import javax.swing.JOptionPane;

public class Banco{
	
	public static void Print(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	public static void main(String[] args) {
		int button = 0;
		int opcaoselecionada = 0;
		
		ContaCorrente conta = new ContaCorrente();
		conta.setNumeroconta(1);
		conta.setId_client(1);
		conta.setAgencia(1);
		conta.setTipoconta("J");
		conta.setSaldo(100.00);
		conta.setAtivo(true);
		
		String[] buttons = { "Sacar", "Depositar", "Consultar", "Sair"};
		do {
			opcaoselecionada = JOptionPane.showOptionDialog(null, "Selecione a ação desejada", "Menu de ações",
			        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[button]);
			switch (opcaoselecionada) {
				case 0:
					System.out.println("Sacar");
						double saque = Byte.parseByte(JOptionPane.showInputDialog("Quanto deseja sacar?"));
						if(saque > conta.getSaldo()) {
							throw new java.lang.Error("Valor a cima do seu saldo");
						} else {
							conta.setSaldo(conta.getSaldo() - saque);
						}
					break;
				case 1:
					System.out.println("Deposito");
						double deposito = Byte.parseByte(JOptionPane.showInputDialog("Quanto deseja depositar?"));
						conta.setSaldo(conta.getSaldo() + deposito);
					break;
				case 2:
					System.out.println("Consultar");
						System.out.printf("Número da conta: %d\n",conta.getNumeroconta());
						System.out.printf("Id do Cliente: %s\n",conta.getId_client());
						System.out.printf("Agência: %s\n",conta.getAgencia());
						System.out.printf("Tipo da conta: %s\n",conta.getTipoconta());
						System.out.printf("Saldo: %s\n",conta.getSaldo());
						System.out.printf("Ativo: %s\n",conta.isAtivo());
					break;
			}
		} while (opcaoselecionada != 3);
	}
}