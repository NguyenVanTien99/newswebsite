package com.learningjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.learningjavaweb.dao.iCategoryDAO;
import com.learningjavaweb.dao.impl.CategoryDAO;
import com.learningjavaweb.model.CategoryModel;
import com.learningjavaweb.service.iCategoryService;

public class CategoryService implements iCategoryService {
	
//	private iCategoryDAO categoryDAO;
//	
//	public CategoryService() {
//		categoryDAO = new CategoryDAO();
//		....
//	}
	
	@Inject
	private iCategoryDAO categoryDAO;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDAO.findAll();
	}
	
}
