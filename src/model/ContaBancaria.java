package model;

public class ContaBancaria {

	private float saldo;
	private int num_conta;
	private String cliente;

	public ContaBancaria() {
		super();
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float sacar(float valor) {

		if (valor < saldo) {
			saldo = saldo - valor;
			System.out.println("voce sacou o valor " + valor +"  o valor total da conta  é " + saldo);
			return saldo;
		} else {
			System.out.println("o valor do saque e insuficiente o valor que voce tem na conta é " + saldo);
			return saldo;
		}

	}

	public float depositar(float valor) {

		
			saldo = saldo + valor;
			System.out.println(" voce depositou, valor total atual é " + saldo);
			return saldo;
		

	}	
	

}
