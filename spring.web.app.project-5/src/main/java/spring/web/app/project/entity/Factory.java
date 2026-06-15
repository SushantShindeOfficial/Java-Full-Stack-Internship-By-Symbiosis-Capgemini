package spring.web.app.project.entity;

public class Factory {
	Data data;

	public Factory(int x) {
		if(x==1) {
			data = new Student();
		}
		if(x==2) {
			data = new Teacher();
		}
		if(x==3) {
			data = new NontechStaff();
		}
		if(x==4) {
			data = new Admin();
		}
		if(x==5) {
			data = new Principal();
		}
	}
}
