package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.SubCategoryRepository;
import project.finalproject.service.SubCategoryDeleteService;

@Service
public class SubCategoryDeleteServiceImple implements SubCategoryDeleteService{
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	public SubCategoryDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteSubCategoryData(int sid) {
		// TODO Auto-generated method stub
		subCategoryRepository.deleteById(sid);
	}

}
