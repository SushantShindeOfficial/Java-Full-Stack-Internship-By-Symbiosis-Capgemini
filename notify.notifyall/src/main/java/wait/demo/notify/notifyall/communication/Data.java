package wait.demo.notify.notifyall.communication;

public class Data extends Thread{
	public void run() {
		synchronized (this) {
			System.out.println("This is data Class");
			System.out.println("Good to have you back");
			System.out.println("Return to roots");
			try {
				wait();
				System.out.println("we are back again");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Execution Done");
		}
	}
}
