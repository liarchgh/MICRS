package com.ldt.table.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ldt.item.entity.User;
import com.ldt.table.dao.UsersDaoImpl;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/LogIn")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		if(name != null && !name.equals("") && pass != null && !pass.equals("")) {
			List<User> users = (new UsersDaoImpl()).selectUsers(new User(Integer.parseInt(name), null, pass));
//			System.out.println(name + " " + pass);
			if(!users.isEmpty()){
				HttpSession session = request.getSession();
				session.setAttribute("user", users.get(0));
				request.getRequestDispatcher("/Manage/production/index.html").forward(request, response);
			}
			else{
				request.setAttribute("message", "用户名或密码错误");
				request.getRequestDispatcher("/Manage/production/login.jsp").forward(request,  response);
			}
		}
		else {
			request.setAttribute("message", "用户名或密码错误");
			request.getRequestDispatcher("/Manage/production/login.jsp").forward(request,  response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
