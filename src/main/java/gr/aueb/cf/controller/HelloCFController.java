package gr.aueb.cf.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello-cf")
public class HelloCFController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloCFController() {
        super();
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String message = "Hello Coding Factory";
		
		PrintWriter writer = response.getWriter();
		writer.println("<html><body><h1>" + message + "</h1></body></html>");
	}
    
    

}
