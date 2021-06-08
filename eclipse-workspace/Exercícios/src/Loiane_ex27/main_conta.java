package Loiane_ex27;

import java.util.ArrayList;
import java.util.Scanner;

public class main_conta {
	
	static ArrayList<Conta> contas = new ArrayList<Conta>(); // ArrayList contendo as contas.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 // criei o ArrayList com o tipo Conta-> obj indicado
		 //	podendo adicionar as contas criadas para conseguir fazer busca.
			
			Conta Nubank = new Conta();	
			Conta lolbank = new Conta();
			
			contas.add(Nubank);
			contas.add(lolbank);
			Nubank.id = 0;
			Nubank.numConta = "001";
			Nubank.contEspecial = false;
			Nubank.limite = 0;
			Nubank.saldo = 300.58;
			
			lolbank.id = 1;
			lolbank.numConta = "002";
			lolbank.contEspecial = true;
			lolbank.limite = 100;
			lolbank.saldo = 500;
			
			boolean reverMenu = true;

			while (reverMenu == true) {
			Menu();	
			switch (GetInputNumber("Escolha uma opção:")) {
					case 0:
						reverMenu = false;
						break ;
					case 1:
						sacar();
					
						break;
					case 2:
						depositar();
						
						break;
					case 3:
						//consultar();
						break;
					case 4:
					//	verificarEspecial();
						break;
					default:
						System.out.println("Opção Invalida, Tente Novamente!");
						Menu();
						break;
						
				}
				
			}
			sc.close();
		}
	
	static int GetInputNumber(String txt) {// entra com o número da escolha do switch
		System.out.println(txt);
				Scanner input = new Scanner(System.in);
				int n = input.nextInt();
				return n;
		}
	
public static double sacar() {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o número do id da conta para efetuar o saque? ");		
			int conta1 = scan.nextInt();
		System.out.println("Qual o valor a sacar? ");
			double val = scan.nextDouble();		
		return contas.get(conta1).saque(val);	// aqui acessa o obj Conta
		}
	
	public static void depositar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o número do id da sua conta? ");
		int conta = sc.nextInt();
		
		System.out.println("Qual o valor de depósito? ");
		double valDeposito = sc.nextDouble();
		contas.get(conta).deposito(valDeposito);;
		sc.close();
	}
	
	static void Menu() { //menu da aplicação
		
		System.out.println("***************************************************");
		System.out.println("*             Bem vido ao nosso banco             *");
		System.out.println("***************************************************");
		System.out.println("*                     Opções                      *");
		System.out.println("***************************************************");
		System.out.println("* 0 - Sair                                        *");
		System.out.println("***************************************************");
		System.out.println("*                      Conta                      *");
		System.out.println("***************************************************");
		System.out.println("* 1 - Sacar                                       *");
		System.out.println("* 2 - Depositar                                   *");
		System.out.println("* 3 - Consultar                                   *");
		System.out.println("* 4 - Verificar Cheque Especial                   *");
		System.out.println("***************************************************");
		
	}

}
