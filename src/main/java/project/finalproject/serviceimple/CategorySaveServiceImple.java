package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Category;
import project.finalproject.repository.CategoryRepository;
import project.finalproject.service.CategorySaveService;

@Service
public class CategorySaveServiceImple implements CategorySaveService{
	@Autowired
	private CategoryRepository categoryRepository;

	public CategorySaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Category saveCategoryData(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

}
