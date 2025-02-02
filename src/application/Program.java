package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, digite o número da Agência: ");
		int num = sc.nextInt();

		System.out.print("Nome da Agência: ");
		String agencia = sc.next();
		System.out.print("Seu nome completo: ");
		String nome = sc.next();
		System.out.print("Saldo atual: ");
		Double saldo = sc.nextDouble();
		
		ContaTerminal conta = new ContaTerminal(num, agencia, nome, saldo);
		
		System.out.println("Olá " + conta.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + 
				", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
		
		sc.close();
	}

}
