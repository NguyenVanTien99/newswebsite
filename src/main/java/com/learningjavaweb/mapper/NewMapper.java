package com.learningjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.learningjavaweb.model.NewsModel;

public class NewMapper implements RowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet resultSet) {

		try {
			NewsModel news = new NewsModel();
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("titile"));
			return news;
		} catch (SQLException e) {
			return null;
		}
	}
	

}
