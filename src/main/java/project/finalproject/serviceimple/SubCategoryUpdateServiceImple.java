package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.SubCategory;
import project.finalproject.repository.SubCategoryRepository;
import project.finalproject.service.SubCategoryUpdateService;

@Service
public class SubCategoryUpdateServiceImple implements SubCategoryUpdateService{
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	public SubCategoryUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public SubCategory updateSubCategoryData(SubCategory subCategory, int sid) {
		// TODO Auto-generated method stub
		SubCategory o1=subCategoryRepository.findById(sid).get();
		o1.setName(subCategory.getName());
		o1.setProducts(subCategory.getProducts());
		o1.setBrands(subCategory.getBrands());
		return subCategoryRepository.save(o1);
	}

}
