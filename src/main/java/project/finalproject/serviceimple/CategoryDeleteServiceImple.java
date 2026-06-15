package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.CategoryRepository;
import project.finalproject.service.CategoryDeleteService;

@Service
public class CategoryDeleteServiceImple implements CategoryDeleteService{
	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteCategoryData(int cid) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(cid);
	}

}
