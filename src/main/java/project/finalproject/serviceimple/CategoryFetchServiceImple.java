package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Category;
import project.finalproject.repository.CategoryRepository;
import project.finalproject.service.CategoryFetchService;

@Service
public class CategoryFetchServiceImple implements CategoryFetchService{
	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Category fetchCategoryData(int cid) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(cid).get();
	}

}
