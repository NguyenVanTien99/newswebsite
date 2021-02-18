package com.learningjavaweb.dao.impl;

import java.util.List;

import com.learningjavaweb.dao.iNewDAO;
import com.learningjavaweb.mapper.NewMapper;
import com.learningjavaweb.model.NewsModel;
import com.learningjavaweb.paging.Pageble;

public class newDAO extends AbstractDAO<NewsModel> implements iNewDAO {
	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryid) {
		String sql = "select * from news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryid);
	
	}

	@Override
	public Long save(NewsModel newModel) {
		//String sql = "INSERT INTO news (titile, content, categoryid) VALUES(?,?,?)";
		StringBuilder sql = new StringBuilder("INSERT INTO news (titile, content,");
		sql.append("thumbnail, shortdescription, categoryid, createddate, createdby )");	
		sql.append("VALUES(?,?,?,?,?,?,?)");
		return insert(sql.toString(), newModel.getTitle(), newModel.getContent()
				, newModel.getThumbnail(), newModel.getShortDecription(), newModel.getCategoryId(),
				newModel.getCreatedDate(), newModel.getCreatedBy());
	}

	@Override
	public NewsModel findOne(Long id) {
		String sql = "select * from news WHERE id = ?";
		List<NewsModel> news = query(sql, new NewMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(NewsModel updatenew) {
		StringBuilder sql = new StringBuilder("UPDATE news SET titile = ?, thumbnail = ?, ");
		sql.append("shortdescription = ?, content = ?, categoryid = ?, ");
		sql.append(" createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ?  WHERE id = ?" );
		update(sql.toString(), updatenew.getTitle(), updatenew.getThumbnail(), updatenew.getShortDecription(),
				updatenew.getContent(), updatenew.getCategoryId(), updatenew.getCreatedDate(), updatenew.getCreatedBy()
				,updatenew.getModifiedDate(),updatenew.getModifiedBy(),updatenew.getId());
		
		
	}

	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM news WHERE id = ?";
		update(sql, id);		
		
	}

	@Override
	public List<NewsModel> findAll(Pageble pageble) {
		/* String sql ="select * from news limit ?,?"; */
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		if(pageble.getSorter() != null) {
			sql.append(" ORDER BY "+pageble.getSorter().getSortName() +" " +pageble.getSorter().getSortBy()+"");
		}
		if(pageble.getOffset() != null && pageble.getLimmit() != null) {
			sql.append(" limit "+pageble.getOffset()+", "+pageble.getLimmit()+"");
		}
		return query(sql.toString(), new NewMapper(), new NewMapper());
		
	}

	@Override
	public int getTotalItems() {
		String sql = "select count(*) FROM news";
		return count(sql);
	}


}
