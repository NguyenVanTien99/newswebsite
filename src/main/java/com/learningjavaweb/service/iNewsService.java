package com.learningjavaweb.service;

import java.util.List;

import com.learningjavaweb.model.NewsModel;
import com.learningjavaweb.paging.Pageble;

public interface iNewsService {
	List<NewsModel> findByCategoryId(Long categoryid);
	NewsModel save(NewsModel newModel);
	NewsModel update(NewsModel updateNew);
	void delete(Long[] ids);
	List<NewsModel> findAll(Pageble pageble);
	int getTotalItem();
}
