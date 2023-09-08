package com.codingbox.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.web.board.dao.BoardDAO;

public class BoardViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		int boardnum = Integer.parseInt( request.getParameter("boardnum") );
		
		// 게시글 조회수 update
		bdao.updateReadCount(boardnum);
		
		// 댓글조회
		request.setAttribute("replylist", bdao.getReplys(boardnum));		
		request.setAttribute("board", bdao.getDetail(boardnum)); 
		forward.setRedirect(false);
		forward.setPath("/board/boardview.jsp");
		
		return forward;
	}

}













