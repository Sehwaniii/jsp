//package com.codingbox.web.board;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.codingbox.action.ActionForward;
//
//
//@WebServlet("*.bo")
//public class BoardFrontController extends HttpServlet{
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doProcess(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doProcess(req, resp);
//    }
//
//    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        System.out.println("URI : "+request.getRequestURI());
//        String requestURI = request.getRequestURI();
//        String responseURI = null;
//        ActionForward forward = null;
////        System.out.println(requestURI);
//        switch(requestURI) {
//        case "/board/BoardWrite.bo":
//        	forward = new ActionForward(true, "/board/Boardwrite.jsp");
//			break;
//        case "/board/BoardWriteOk.bo":
//        	forward = BoardWriteOkAction().execute(request,response);
//        	break;
//        }
//        // /board/BoardWriteOk.bo
//		  // insert, BoardWriteOkAction
//        // DAO : insertBoard()
//        // board.xml : insertBoard()
//        
//        
//        if(forward != null) {
//        	if(forward.isRedirect()) {
//        		// redirect 방식으로 페이지 이동
//        		response.sendRedirect(forward.getPath());
//        	} else {
//        		// forward 방식으로 페이지 이동
//        		RequestDispatcher disp = request.getRequestDispatcher(forward.getPath());
//        		 disp.forward(request,response);
//
//        	}
//        }
//        	
//        	
//        // request.getRequestDispatcher(responseURI).forward(request, response);
//    }
//}




package com.codingbox.web.board;

import com.codingbox.action.ActionForward;
import com.codingbox.web.board.dao.BoardDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String responseURI = null;
		ActionForward forward = null;

		// 작성
		if (requestURI.equals("/board/BoardWrite.bo")) {
			forward = new ActionForward(true, "/board/boardwrite.jsp");
		}else if(requestURI.equals("/board/BoardWriteOk.bo")){
			forward = new BoardWriteOkAction().execute(request,response);
		}else if(requestURI.equals("/board/BoardList.bo")) {
			forward = new BoardListAction().execute(request, response);

		}else if(requestURI.equals("/board/BoardView.bo")) {

			forward = new BoardViewAction().execute(request, response);
		}else if(requestURI.equals("/board/AddReply.bo")) {
			forward = new AddReplyAction().execute(request, response);
			// dao, addReply
			// xml, addReply
		}else if(requestURI.equals("/board/UpdateReply.bo")) {
			forward = new UpdateReplyAction().execute(request, response);
		}else if(requestURI.equals("/board/DeleteReply.bo")) {
			forward = new DeleteReplyAction().execute(request, response);
		}
		// 일괄처리
		if (forward != null) {
			if (forward.isRedirect()) {
				// redirect 방식으로 페이지 이동
				response.sendRedirect(forward.getPath());
			} else {
				// forward 방식으로 페이지 이동
				RequestDispatcher disp = request.getRequestDispatcher(forward.getPath());
				disp.forward(request, response);
			}
		}
	}
}