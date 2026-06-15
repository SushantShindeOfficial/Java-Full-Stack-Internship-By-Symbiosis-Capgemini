package wait.demo.notify.notifyall.communication;

public class Product extends Thread{
	Data d1;

	public Product(Data d1) {
		super();
		this.d1 = d1;
	}
	
	public void run() {
		synchronized (d1) {
			System.out.println("we are in product Class");
			System.out.println("Product Executed");
			
			System.out.println("Product execution is done");
			d1.notify();
		}
	}
}
