package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDao;
import com.example.demo.model.Board;

@Service
public class BoardService{

	@Autowired
	private BoardDao dao;

	public int insert(Board board) {
		// TODO Auto-generated method stub
		return dao.insert(board);
	}
}
