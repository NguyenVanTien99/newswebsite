package com.learningjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.learningjavaweb.model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel> {


	@Override
	public CategoryModel mapRow(ResultSet resultSet) {
		try {
			CategoryModel categoryModel = new CategoryModel();
			categoryModel.setId(resultSet.getLong("id"));
			categoryModel.setCode(resultSet.getString("code"));
			categoryModel.setName(resultSet.getString("Name"));
			return categoryModel;
		} catch (SQLException e) {
			return null;
		}
		
	}

}
