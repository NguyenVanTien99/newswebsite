package com.learningjavaweb.dao;

import java.util.List;

import javax.inject.Inject;

import com.learningjavaweb.model.CategoryModel;

public interface iCategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
}
