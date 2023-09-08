package com.codingbox.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.web.board.dao.BoardDAO;
import com.codingbox.web.board.dao.BoardDTO;

public class BoardWriteOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();

		// db연결, insert
		BoardDAO bdao = new BoardDAO();
		// DTO
		BoardDTO bdto = new BoardDTO();

		bdto.setBoardtitle(request.getParameter("boardtitle"));
		bdto.setBoardcontent(request.getParameter("boardcontents"));
		bdto.setUsername(request.getParameter("username"));


		
		if (bdao.insertBoard(bdto)) {
			// 성공
			forward.setPath("/board/BoardWrite.bo");
		} else {
			// 회원가입 실패
			forward.setPath("/board/BoardWrite.bo");
		}
		forward.setRedirect(true);
		return forward;
	}


}
