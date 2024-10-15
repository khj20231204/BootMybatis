package com.example.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Board;

@Repository //클래스로 만든 경우 Repository 어노테이션 사용, interface는 Mapper사용
public class BoardDao {

	@Autowired
	private SqlSession session;

	public int insert(Board board) {
		
		return session.insert("insert",board);
	}
}
