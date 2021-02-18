package com.learningjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.learningjavaweb.dao.iNewDAO;
import com.learningjavaweb.model.NewsModel;
import com.learningjavaweb.paging.Pageble;
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
		newModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		newModel.setCreatedBy("");
		Long newId = newsDAO.save(newModel);
		return newsDAO.findOne(newId);
		
	}


	@Override
	public NewsModel update(NewsModel updateNew) {
		NewsModel oldnew = newsDAO.findOne(updateNew.getId());
		updateNew.setCreatedDate(oldnew.getCreatedDate());
		updateNew.setCreatedBy(oldnew.getCreatedBy());
		updateNew.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		updateNew.setModifiedBy("");
		newsDAO.update(updateNew);
		return newsDAO.findOne(updateNew.getId());
	}


	@Override
	public void delete(Long[] ids) {
//		delete comment		
		for (long id: ids) {
			newsDAO.delete(id);
		}
		
	}


	@Override
	public List<NewsModel> findAll(Pageble pageble) {
		return newsDAO.findAll(pageble);
	}


	@Override
	public int getTotalItem() {
		return newsDAO.getTotalItems();
	}



}
