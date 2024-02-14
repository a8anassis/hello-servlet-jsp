package gr.aueb.cf.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import gr.aueb.cf.model.Teacher;

@WebServlet("/teachers")
public class TeachersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String admin = "Admin";
		request.setAttribute("admin", admin);
		
		request.getRequestDispatcher("/jsps/teachers-search.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String lastname = request.getParameter("lastname");
		System.out.println(lastname);
		
		if (lastname.equals("Androutsos")) {
			List<Teacher> teachers = Arrays.asList(new Teacher(1L, "SSN1", "Athana", "Androu"), 
					new Teacher(2L, "SSN2", "Anna", "Giannou"));
			request.setAttribute("teachers", teachers);
			request.getRequestDispatcher("/jsps/teachers.jsp").forward(request, response);
		} else {
			response.getWriter().println("<h2>Teacher not found</h2>");
			request.getRequestDispatcher("/jsps/teachers-search.jsp").include(request, response);
		}
	}

}
