package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Category;
import project.finalproject.repository.CategoryRepository;
import project.finalproject.service.CategoryUpdateService;

@Service
public class CategoryUpdateServiceImple implements CategoryUpdateService{
	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Category updateCategoryData(Category category, int cid) {
		// TODO Auto-generated method stub
		Category existingEntity = categoryRepository.findById(cid).get();
		Category o1 = project.finalproject.factory.CategoryFactory.createCategory();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, o1);
		o1.setName(category.getName());
		o1.setSubCategories(category.getSubCategories());
		o1.setProducts(category.getProducts());
		o1.setBrands(category.getBrands());
		return categoryRepository.save(o1);
	}

}
