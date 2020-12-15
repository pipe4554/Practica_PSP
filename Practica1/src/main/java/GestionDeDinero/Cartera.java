package GestionDeDinero;

public class Cartera extends Thread {

	private float dinero = 0;

	// --------------geters y seters

	public float getDinero() {
		return dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}
	
	//       constructor

	public Cartera(float dinero) {
		super();
		this.dinero = dinero;
	}

	// ----------metodos

	public synchronized void incrementar() {
		dinero = +(float) Math.floor(Math.random() * 100 + 0);
		try {

			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("He incrementado el dinero");
	}

	public synchronized void decrementar() {
		dinero = -(float) Math.floor(Math.random() * 100 + 0);
		try {

			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("He decrementado el dinero");
	}

}
