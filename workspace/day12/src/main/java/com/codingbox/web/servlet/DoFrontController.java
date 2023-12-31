package com.codingbox.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class DoFrontController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doProcess(req, resp);
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	System.out.println("uri : "+request.getRequestURI());
    	String requestURI = request.getRequestURI();
    	if( requestURI.equals("/do1.do")) {
//            request.setAttribute("result", "do1으로 요청보내기");
//            request.getRequestDispatcher("do1.jsp").forward(request, response);
            requestURI = new Do1().execute(request, response);
    	}else if(requestURI.equals("/do2.do")) {
//        	request.setAttribute("result", "do2으로 요청보내기");
//            request.getRequestDispatcher("do2.jsp").forward(request, response);
            requestURI = new Do2().execute(request, response);
    	}else if(requestURI.equals("/do3.do")) {
//        	request.setAttribute("result", "do3으로 요청보내기");
//            request.getRequestDispatcher("do3.jsp").forward(request, response);
            requestURI = new Do3().execute(request, response);
    	}
    }



}
