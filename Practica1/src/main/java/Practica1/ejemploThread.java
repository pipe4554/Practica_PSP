package Practica1;

public class ejemploThread extends Thread {
	
	public void run() {
		int randomnum = (int) Math.floor(Math.random()*5+1);
		
		System.out.println("Hola soy el hilo " + getName() + " y me pongo a dormir " + randomnum + " segundos");
		
		try {
			sleep(randomnum*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("Soy el hilo " + getName() + " y he terminado de dormir");
		
	}
}
