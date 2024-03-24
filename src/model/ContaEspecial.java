package model;

public class ContaEspecial extends ContaBancaria {

	public ContaEspecial() {
		// TODO Auto-generated constructor stub
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	private float limite;

	@Override
	public float sacar(float valor) {

		if (limite + getSaldo() < valor) {
			System.out.println(" CONTA ESPECIAL ******" +"o valor que voce deseja sacar e maior do que o seu saldo e limite, o seu saldo é "
					+ getSaldo() + "e maior do que o limite " );
			return -1;
		} else {

			setSaldo(getSaldo() - valor);
			System.out.println(" CONTA ESPECIAL ******  o seu saldo atual e " + getSaldo() + " e voce acabou de sacar o valor de " + valor );
			return getSaldo();

		}
	}

}
