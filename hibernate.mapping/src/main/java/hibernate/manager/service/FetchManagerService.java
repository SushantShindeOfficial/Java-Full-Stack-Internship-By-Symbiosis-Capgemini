package hibernate.manager.service;

import java.util.List;

import hibernate.hibernate.mapping.entity.Company;

public interface FetchManagerService {
	List<Company> FetchData();
	
}
