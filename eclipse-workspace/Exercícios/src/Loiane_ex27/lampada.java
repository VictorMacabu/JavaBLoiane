package Loiane_ex27;
//ex1 list27
public class lampada {
	
	String tipo;
	String marca;
	int potencia;
	int voltPadrao; // voltagem padr�o
	Boolean acesa;
	
	Boolean acenderLampada() {
		if(this.acesa == false) {
			acesa = true;
			System.out.println("acendi a l�mpada");
			return acesa;
		}else {
			System.out.println("a l�mpada j� est� acesa!!!");
			return acesa;	
		}		
	}
	Boolean apagarLampada() {
		if(this.acesa == true) {
			acesa = false;
			System.out.println("apaguei a l�mpada");
			return acesa;
		}else {
			System.out.println("a l�mpada j� est� apagada!!!");
			return acesa;	
		}		
	}
}
