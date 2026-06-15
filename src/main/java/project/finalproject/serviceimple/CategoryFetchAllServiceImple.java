package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Category;
import project.finalproject.repository.CategoryRepository;
import project.finalproject.service.CategoryFetchAllService;

@Service
public class CategoryFetchAllServiceImple implements CategoryFetchAllService{
	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Category> fetchAllCategoryData() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
