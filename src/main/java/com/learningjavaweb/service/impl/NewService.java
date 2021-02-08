package com.learningjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.learningjavaweb.dao.iNewDAO;
import com.learningjavaweb.model.NewsModel;
import com.learningjavaweb.service.iNewsService;

public class NewService implements iNewsService {
	@Inject
	private iNewDAO newsDAO;
	
	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryid) {
		return newsDAO.findByCategoryId(categoryid);
	}


	@Override
	public NewsModel save(NewsModel newModel) {
		Long newid = newsDAO.save(newModel);
		System.out.println(newid);
		return null;
	}

}
