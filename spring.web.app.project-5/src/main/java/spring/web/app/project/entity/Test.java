package spring.web.app.project.entity;

public class Test {
	public static void main(String[] args) {
		Factory f1=new Factory(1);
		f1.data.getData();
		Factory f2=new Factory(2);
		f2.data.getData();
		Factory f3=new Factory(3);
		f3.data.getData();
	}
}
