package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		ContaEspecial CE = new ContaEspecial();
		ContaPoupanca CP = new ContaPoupanca();

	System.out.println("****************************** CONTA ESPECIAL *****************************************");
		CE.setCliente("Amos");
		CE.setNum_conta(1);
		CE.setSaldo(1000f);
		CE.setLimite(500f);
		CE.sacar(500);
		CE.sacar(1000F);
		CE.sacar(500);
		CE.depositar(200);
		System.out.println("********************************************************************************************************************");
		
		System.out.println("****************************** CONTA POUPANCA *****************************************");
		CP.setCliente("Silva");
		CP.setNum_conta(2);
		CP.setSaldo(1000f);
		CP.setRendimentoDiario(1.15f);
		CP.sacar(500);
		CP.sacar(700);
		CP.depositar(200);
		CP.calcNovoSaldo();
		
		System.out.println("********************************************************************************************************************");

		
		System.out.println("CONTA ESPECIAL");
		System.out.println(" o nome do cliente e " + CE.getCliente() + " o numero da conta  é " + CE.getNum_conta()
				+ " e o saldo e " + CE.getSaldo());
		System.out.println("********************************************************************************************************************");
		System.out.println("CONTA POUPANCA");
		System.out.println(" o nome do cliente e " + CP.getCliente() + " o numero da conta  é " + CP.getNum_conta()
				+ " e o saldo e " + CP.getSaldo());

	}

}
