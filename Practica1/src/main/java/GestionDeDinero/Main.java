package GestionDeDinero;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cartera ct = new Cartera(0);
		
		/* metodos syncronized
		
		ct.incrementar();
		ct.decrementar();
		
		System.out.println(ct.getDinero());*/
		
		for (int i = 0; i < 10; i++) {
			
			new Client(ct).start();
			//new Client(ct).setPriority(Thread.MIN_PRIORITY);
			new Worker(ct).start();
			//new Worker(ct).setPriority(Thread.MAX_PRIORITY);
		}
		try {
			ct.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("cantidad de dinero actual en la cartera " + ct.getDinero() + " $");
		
	}

}
