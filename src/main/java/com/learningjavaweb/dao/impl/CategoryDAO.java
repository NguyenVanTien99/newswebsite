package com.learningjavaweb.dao.impl;

import java.util.List;

import com.learningjavaweb.dao.iCategoryDAO;
import com.learningjavaweb.mapper.CategoryMapper;
import com.learningjavaweb.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements iCategoryDAO {
	@Override
	public List<CategoryModel> findAll() {
		String sql = "select * from category";
		return query(sql, new CategoryMapper());
	}

}
