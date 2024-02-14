package gr.aueb.cf.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import gr.aueb.cf.model.Teacher;

@WebServlet("/teacher")
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String admin = "Admin";
		request.setAttribute("admin", admin);
		
		request.getRequestDispatcher("/jsps/teacher-search.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String lastname = request.getParameter("lastname");
		System.out.println(lastname);
		
		if (lastname.equals("Androutsos")) {
			Teacher teacher = new Teacher(1L, "SSN1234", "Athanassios", "Androutsos");
			request.setAttribute("teacher", teacher);
			request.getRequestDispatcher("/jsps/teacher.jsp").forward(request, response);
		} else {
			response.getWriter().println("<h2>Teacher not found</h2>");
			request.getRequestDispatcher("/jsps/teacher-search.jsp").include(request, response);
		}
	}

}
