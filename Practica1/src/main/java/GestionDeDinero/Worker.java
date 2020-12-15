package GestionDeDinero;

public class Worker extends Thread{
	
	private Cartera cartera;
	public Worker(Cartera cartera) {
		this.cartera = cartera;
	}
	
	public void run() {
		
			try {
				sleep(1000);
				cartera.decrementar();
				System.out.println("worker ha restado dinero");
		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

	}
}
