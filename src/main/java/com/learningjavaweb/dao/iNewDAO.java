package com.learningjavaweb.dao;

import java.util.List;

import com.learningjavaweb.model.NewsModel;
import com.learningjavaweb.paging.Pageble;

public interface iNewDAO extends GenericDAO<NewsModel> {
	NewsModel findOne(Long id);
	List<NewsModel> findByCategoryId(Long categoryid);
	Long save(NewsModel newModel);
	void update (NewsModel updatenew);
	void delete(Long id);
	List<NewsModel> findAll(Pageble pageble);
	int getTotalItems();
}
