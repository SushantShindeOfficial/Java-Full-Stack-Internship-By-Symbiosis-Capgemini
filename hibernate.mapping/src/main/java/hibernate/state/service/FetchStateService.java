package hibernate.state.service;

import java.util.List;

import hibernate.hibernate.mapping.entity.Company;

public interface FetchStateService {
	List<Company> FetchData();
	
}
