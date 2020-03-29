package Q2.teste;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Q2.classes.*;

public class Contas {

	public static void main(String[] args) {
		
		float valorSaque;
		float valorDeposito;
		char resp = 's';
		int opcao, opcao2 ;
		int opcaoTipoConta ;
				
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaEspecial contaEspecial = new ContaEspecial();
		while (resp == 's'){
			
			opcaoTipoConta = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "\n1. Poupança"
					+ "\n2. Conta Corrente"
					+ "\n6. Sair", "Escolha uma opção"));
			if (opcaoTipoConta == 1){
				opcao = Integer.parseInt(JOptionPane.showInputDialog(""
						+ "\n   Conta Poupança \n"
						+ "\n1. Cadastrar Cliente"
						+ "\n2. Efetuar Saque"
						+ "\n3. Depositar valor"
						+ "\n4. Mostrar rendimentos"
						+ "\n5. Saldo"
						+ "\n6. Sair", "Escolha uma opção"));
				if (opcao == 1){
					contaPoupanca.pedirDados();
				}else if (opcao == 2){
					valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor do SAQUE: "));
					contaPoupanca.sacar(valorSaque);					
				}else if (opcao == 3){
					valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Valor para depósito: "));
					contaPoupanca.depositar(valorDeposito);
				}else if (opcao == 4){
					contaPoupanca.calcularNovoSaldo();
				}else if (opcao == 5){
					JOptionPane.showMessageDialog(null, contaPoupanca.getSaldo());
				}else if (opcao == 6){
					continue;
				}
			}else if (opcaoTipoConta == 2){
				opcao2 = Integer.parseInt(JOptionPane.showInputDialog(""
						+ "\n   Conta Especial \n"
						+ "\n1. Cadastrar Cliente"
						+ "\n2. Efetuar Saque"
						+ "\n3. Depositar valor"
						+ "\n4. Saldo"
						+ "\n4. Lançar limite"
						+ "\n6. Sair", "Escolha uma opção"));
				if (opcao2 == 1){
					contaEspecial.pedirDados();
				}else if (opcao2 == 2){
					valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor do SAQUE: "));
					contaEspecial.sacar(valorSaque);					
				}else if (opcao2 == 3){
					valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Valor para depósito: "));
					contaEspecial.depositar(valorDeposito);
				}else if (opcao2 == 4){
					JOptionPane.showMessageDialog(null,contaEspecial.getSaldo());
				}else if (opcao2 == 5){
					contaEspecial.setLimite(Float.parseFloat(JOptionPane.showInputDialog("Valor do limite: ")));
				}else if (opcao2 == 6){
					continue;
				}
				
			}else if (opcaoTipoConta == 6){
				JOptionPane.showMessageDialog(null, "Fuiii!!!!");
				break;
			}
			

		
		}
		//JOptionPane.showMessageDialog(null, "Qual o número da sua conta?", "Conta Bancária", QUESTION_MESSAGE, icon);
		//contaPoupanca.sacar(500);
		

	}

}
