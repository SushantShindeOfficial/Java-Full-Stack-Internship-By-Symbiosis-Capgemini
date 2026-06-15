package hibernate.owner.service;

import java.util.List;

import hibernate.hibernate.mapping.entity.Company;

public interface FetchOwnerService {
	List<Company> FetchData();
	
}
