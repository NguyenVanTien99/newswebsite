package com.learningjavaweb.dao;

import java.util.List;

import com.learningjavaweb.model.NewsModel;

public interface iNewDAO extends GenericDAO {
	List<NewsModel> findByCategoryId(Long categoryid);
	Long save(NewsModel newModel);
}
