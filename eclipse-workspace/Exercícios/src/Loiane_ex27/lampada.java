package Loiane_ex27;
//ex1 list27
public class lampada {
	
	String tipo;
	String marca;
	int potencia;
	int voltPadrao; // voltagem padrão
	Boolean acesa;
	
	Boolean acenderLampada() {
		if(this.acesa == false) {
			acesa = true;
			System.out.println("acendi a lâmpada");
			return acesa;
		}else {
			System.out.println("a lâmpada já está acesa!!!");
			return acesa;	
		}		
	}
	Boolean apagarLampada() {
		if(this.acesa == true) {
			acesa = false;
			System.out.println("apaguei a lâmpada");
			return acesa;
		}else {
			System.out.println("a lâmpada já está apagada!!!");
			return acesa;	
		}		
	}
}
