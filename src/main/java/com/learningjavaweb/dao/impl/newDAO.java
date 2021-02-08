package com.learningjavaweb.dao.impl;

import java.util.List;

import com.learningjavaweb.dao.iNewDAO;
import com.learningjavaweb.mapper.NewMapper;
import com.learningjavaweb.model.NewsModel;

public class newDAO extends AbstractDAO implements iNewDAO {
	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryid) {
		String sql = "select * from news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryid);

	}

	@Override
	public Long save(NewsModel newModel) {
		String sql = "INSERT INTO news (titile, content, categoryid) VALUES(?,?,?)";
		return insert(sql, newModel.getTitle(), newModel.getContent(), newModel.getCategoryId());
	}

}
