package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Deseja realizar um depoisto inicial (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.println("Digite um valor inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, titular, depositoInicial);
			
			
		}
		else {
			conta = new Conta(numeroConta, titular);
		}		
		
		System.out.println("===============================");
		System.out.println("Dados da conta : ");
		System.out.println(conta);
		
		System.out.println("===============================");
		System.out.println("Entre com o valor para deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("===============================");
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println("===============================");
		
		System.out.println("Entre com o valor de saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println("Dados Da conta atualizados: ");
		System.out.println(conta);
		
		
		
		sc.close();

	}

}
