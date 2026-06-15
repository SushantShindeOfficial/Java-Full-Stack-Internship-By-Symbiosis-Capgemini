package moto.edge60pro.service;

import java.io.IOException;
import java.sql.SQLException;

public interface FetchService {
	void getData()throws SQLException,IOException,ClassNotFoundException;
}
