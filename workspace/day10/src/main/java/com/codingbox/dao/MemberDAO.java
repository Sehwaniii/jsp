package com.codingbox.dao;

import com.codingbox.dto.MemberDTO;
import com.codingbox.web.mybatis.SqlMapConfig;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MemberDAO {
    SqlSessionFactory factory = SqlMapConfig.getFactory();
    SqlSession sqlSession;

    public MemberDAO() {
        sqlSession = factory.openSession(true);
        // true = auto commit

    }

    public MemberDTO searchById(String userid) {
        return (MemberDTO)sqlSession.selectOne("Member.searchById", userid);

    }
}