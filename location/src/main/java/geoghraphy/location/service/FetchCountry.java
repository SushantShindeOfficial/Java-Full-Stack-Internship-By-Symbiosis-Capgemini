package geoghraphy.location.service;

import java.io.IOException;
import java.sql.SQLException;

public interface FetchCountry {
	void getData() throws SQLException,IOException,ClassNotFoundException;
}
