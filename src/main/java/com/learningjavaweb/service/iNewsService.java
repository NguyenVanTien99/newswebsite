package com.learningjavaweb.service;

import java.util.List;

import com.learningjavaweb.model.NewsModel;

public interface iNewsService {
	List<NewsModel> findByCategoryId(Long categoryid);
	NewsModel save(NewsModel newModel);
}
