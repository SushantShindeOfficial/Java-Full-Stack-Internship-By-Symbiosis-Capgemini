package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.SubCategory;
import project.finalproject.repository.SubCategoryRepository;
import project.finalproject.service.SubCategorySaveService;

@Service
public class SubCategorySaveServiceImple implements SubCategorySaveService{
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	public SubCategorySaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public SubCategory saveSubCategoryData(SubCategory subCategory) {
		// TODO Auto-generated method stub
		SubCategory newSubCategory = project.finalproject.factory.SubCategoryFactory.createSubCategory();
		org.springframework.beans.BeanUtils.copyProperties(subCategory, newSubCategory);
		return subCategoryRepository.save(newSubCategory);
	}

}
