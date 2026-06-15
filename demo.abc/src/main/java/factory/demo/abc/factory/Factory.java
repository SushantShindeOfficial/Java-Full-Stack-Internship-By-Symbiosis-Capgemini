package factory.demo.abc.factory;

import factory.demo.abc.serviceimple.CreateServidceImple;
import factory.demo.abc.serviceimple.DeleteServiceImple;
import factory.demo.abc.serviceimple.FetchServiceImple;
import factory.demo.abc.serviceimple.UpdateServiceImple;

public class Factory {
	int x;

	public Factory(int x) {
		if (x==1)
			new CreateServidceImple().addData();
		if (x==2)
			new UpdateServiceImple().ChangeData();
		if (x==3)
			new DeleteServiceImple().removeData();
		if (x==4)
			new FetchServiceImple().getData();
	}
	
}
