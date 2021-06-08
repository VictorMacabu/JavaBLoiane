package Loiane_ex27;

import java.util.Scanner;

public class Main_ex27 {
	public static void main(String[] args) {
		lampada garagem = new lampada();
		
		garagem.tipo = "led";
		garagem.acesa = true;
		garagem.acenderLampada();
		System.out.println(garagem.acesa);
		garagem.apagarLampada();
		System.out.println(garagem.acesa);
		garagem.apagarLampada();
		System.out.println(garagem.acesa);
		garagem.acenderLampada();
		System.out.println(garagem.acesa);

	}

}
