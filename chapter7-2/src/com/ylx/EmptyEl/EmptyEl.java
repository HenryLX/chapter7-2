package com.ylx.EmptyEl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmptyEl")
public class EmptyEl  extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Object> list =new ArrayList<>();
		List<Object> list2 =new ArrayList<>();
		list.add("11");
		req.getSession().setAttribute("list", list);
		req.getSession().setAttribute("list2", list2);
		req.getRequestDispatcher("/emptyEl.jsp").forward(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}