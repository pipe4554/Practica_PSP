package GestionDeDinero;

public class Client extends Thread{
	private Cartera cartera; 
	public Client(Cartera cartera) {
		this.cartera = cartera;
	}
	
	public void run() {
		
			try {
				sleep(1000);
				cartera.incrementar();
				System.out.println("client ha a añadido dinero");
		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

	}
}
