package Loiane_ex27;

public class Conta {

	String numConta;
	int id;
	double saldo;
	double limite;
	boolean contEspecial;
	
	double saque(double x) {
		double saque = x;
		if(saque > (this.saldo + limite)) {
			System.out.println("Aten��o! \nSaque n�o permitido, valor acima do esperado.");
			System.out.println("Seu saldo atual �: " + this.saldo);
			
		}else {
			this.saldo = this.saldo - saque;
			System.out.println("Seu saldo restante �: " + this.saldo);
			
		}
		return saque;
	}
	void deposito(double x) {
		this.saldo = this.saldo + x;
		
		System.out.println("Seu novo saldo � " + this.saldo);
	
	}
		
}
