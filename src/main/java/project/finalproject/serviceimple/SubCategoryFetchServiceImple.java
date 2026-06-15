package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.SubCategory;
import project.finalproject.repository.SubCategoryRepository;
import project.finalproject.service.SubCategoryFetchService;

@Service
public class SubCategoryFetchServiceImple implements SubCategoryFetchService{
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	public SubCategoryFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public SubCategory fetchSubCategoryData(int sid) {
		// TODO Auto-generated method stub
		return subCategoryRepository.findById(sid).get();
	}

}
