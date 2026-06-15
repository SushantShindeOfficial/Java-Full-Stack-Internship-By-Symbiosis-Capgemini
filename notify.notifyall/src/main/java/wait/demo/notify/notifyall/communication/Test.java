package wait.demo.notify.notifyall.communication;

public class Test {
	public static void main(String[] args) {
		Data d1=new Data();
		Product p1=new Product(d1);
		
		d1.start();
		p1.start();
	}
}
