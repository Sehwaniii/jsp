package com.codingbox.web.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.web.board.dao.BoardDAO;
import com.codingbox.web.board.dao.ReplyDTO;

public class AddReplyAction implements Action{

   @Override
   public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
      ActionForward forward = new ActionForward();
      
      BoardDAO bdao = new BoardDAO();
      ReplyDTO reply = new ReplyDTO();
      
      int boardnum = Integer.parseInt(request.getParameter("boardnum"));
      String usernmae = request.getParameter("username");
      String password = request.getParameter("password");
      String replycontent = request.getParameter("replycontent");
      
      reply.setBoardnum(boardnum);
      reply.setUsername(usernmae);
      reply.setPassword(password);
      reply.setReplycontent(replycontent);  // 데이타 set
      
      //이제 db 넘겨줌
      if ( bdao.addReply(reply)) {
         //등록 성공
         forward.setRedirect(true);
         forward.setPath("/board/BoardView.bo?boardnum=" + boardnum);
      } else {
         //등록 실패
         forward.setRedirect(false);
         try {
            PrintWriter out =  response.getWriter();
            out.println("<script>alert('오류발생');history.back();</script>");
         } catch (IOException e) {
            
            e.printStackTrace();
         }
      }
      
      return forward;
   }
   

}