package com.learningjavaweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learningjavaweb.model.NewsModel;
import com.learningjavaweb.model.UserModel;
import com.learningjavaweb.service.iCategoryService;
import com.learningjavaweb.service.iNewsService;
import com.learningjavaweb.service.impl.CategoryService;

@WebServlet(urlPatterns = { "/trang-chu", })
public class HomeController extends HttpServlet {

	@Inject
	private iCategoryService categoryService;

	@Inject
	private iNewsService newsService;

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * String title = "Bài Viết 4"; String content = "đây là nội dung bài viết 4 ";
		 * Long categoryId = 1L; NewsModel newsModel = new NewsModel();
		 * newsModel.setTitle(title); newsModel.setContent(content);
		 * newsModel.setCategoryId(categoryId); newsService.save(newsModel); set thuộc
		 * tính , gọi Service req.setAttribute("categories", categoryService.findAll());
		 * Điều hướng sang giao diện tương ứng
		 */
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/web/home.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
