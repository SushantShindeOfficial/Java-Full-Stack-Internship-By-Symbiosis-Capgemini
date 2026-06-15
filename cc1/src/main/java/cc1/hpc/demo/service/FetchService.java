package cc1.hpc.demo.service;

import java.io.IOException;
import java.sql.SQLException;

public interface FetchService {
	void getData()throws ClassNotFoundException,IOException,SQLException;
}
