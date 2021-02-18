package com.learningjavaweb.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learningjavaweb.constant.SystemConstant;
import com.learningjavaweb.model.NewsModel;
import com.learningjavaweb.paging.PageRequest;
import com.learningjavaweb.paging.Pageble;
import com.learningjavaweb.service.iNewsService;
import com.learningjavaweb.sort.Sorter;
import com.learningjavaweb.utils.FormUtil;


@WebServlet(urlPatterns = {"/admin-new"})
public class NewController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Inject
	iNewsService newService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NewsModel model = FormUtil.toModel(NewsModel.class, req);
		Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(), new Sorter(model.getSortName(), model.getSortBy()));	
		model.setListResult(newService.findAll(pageble));
		model.setTotalItems(newService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItems() / model.getMaxPageItem()));
		req.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/admin/new/list.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	
		
}
